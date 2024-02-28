/* Reto #1
 * Escribe un programa que reciba un texto y transforme lenguaje natural a
 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
 *  se caracteriza por sustituir caracteres alfanuméricos.
 * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/) 
 *   con el alfabeto y los números en "leet".
 *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
 */

import java.util.Scanner;

/**
 * lenguajeHacker
 */
public class lenguajeHacker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine().toLowerCase();

        char letra = ' ';

        

        for (int index = 0; index < entrada.length(); index++) {

        }

        letra = entrada.charAt(0);

        System.out.println(letra);

        scanner.close();
    }
}