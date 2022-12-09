/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passwordgenerator;

import java.util.Random;

public class PasswordGenerator {
  public static void main(String[] args) {
    // Définissez la longueur du mot de passe
    int passwordLength = 20;

    // Créez un générateur de nombres aléatoires
    Random random = new Random();

    // Définissez la liste de caractères disponibles pour le mot de passe
    String availableCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=";

    // Générez le mot de passe
    String password = "";
    for (int i = 0; i < passwordLength; i++) {
      int randomIndex = random.nextInt(availableCharacters.length());
      char randomCharacter = availableCharacters.charAt(randomIndex);
      password += randomCharacter;
    }

    // Affichez le mot de passe généré
    System.out.println("Mot de passe généré : " + password);
  }
}
