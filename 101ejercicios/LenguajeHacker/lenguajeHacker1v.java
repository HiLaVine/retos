/* Reto #1
 * Escribe un programa que reciba un texto y transforme lenguaje natural a
 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
 *  se caracteriza por sustituir caracteres alfanuméricos.
 * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/) 
 *   con el alfabeto y los números en "leet".
 *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * lenguajeHacker
 */
public class lenguajeHacker1v {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine().toLowerCase();

        String[] aux = new String[entrada.length()];

        /*
         * Map<String, String> leet = new HashMap<>();
         * 
         * leet.put("a", "4");
         */

        for (int index = 0; index < entrada.length(); index++) {
            aux[index] = String.valueOf(entrada.charAt(index));
        }

        for (int i = 0; i < aux.length; i++) {
            if (aux[i].equals("a") || aux[i].equals("á")) {
                aux[i] = "4";
            } else if (aux[i].equals("e") || aux[i].equals("é")) {
                aux[i] = "3";
            } else if (aux[i].equals("i") || aux[i].equals("í")) {
                aux[i] = "1";
            } else if (aux[i].equals("o") || aux[i].equals("ó")) {
                aux[i] = "0";
            } else if (aux[i].equals("u") || aux[i].equals("ú")) {
                aux[i] = "(_)";
            } else if (aux[i].equals("b")) {
                aux[i] = "I3";
            } else if (aux[i].equals("c")) {
                aux[i] = "[";
            } else if (aux[i].equals("d")) {
                aux[i] = ")";
            } else if (aux[i].equals("f")) {
                aux[i] = "|=";
            } else if (aux[i].equals("g")) {
                aux[i] = "&";
            } else if (aux[i].equals("h")) {
                aux[i] = "#";
            } else if (aux[i].equals("j")) {
                aux[i] = ",_|";
            } else if (aux[i].equals("k")) {
                aux[i] = ">|";
            } else if (aux[i].equals("l")) {
                aux[i] = "7";
            } else if (aux[i].equals("m")) {
                aux[i] = "IVI";
            } else if (aux[i].equals("n")) {
                aux[i] = "^/";
            } else if (aux[i].equals("o")) {
                aux[i] = "Ø";
            } else if (aux[i].equals("p")) {
                aux[i] = "|*";
            } else if (aux[i].equals("q")) {
                aux[i] = "(_,)";
            } else if (aux[i].equals("r")) {
                aux[i] = "I2";
            } else if (aux[i].equals("s")) {
                aux[i] = "5";
            } else if (aux[i].equals("t")) {
                aux[i] = "7";
            } else if (aux[i].equals("v")) {
                aux[i] = "|/";
            } else if (aux[i].equals("w")) {
                aux[i] = "'//";
            } else if (aux[i].equals("x")) {
                aux[i] = "><";
            } else if (aux[i].equals("y")) {
                aux[i] = "`/";
            } else if (aux[i].equals("z")) {
                aux[i] = "2";
            } else if (aux[i].equals("1")) {
                aux[i] = "L";
            } else if (aux[i].equals("2")) {
                aux[i] = "R";
            } else if (aux[i].equals("3")) {
                aux[i] = "E";
            } else if (aux[i].equals("4")) {
                aux[i] = "A";
            } else if (aux[i].equals("5")) {
                aux[i] = "S";
            } else if (aux[i].equals("6")) {
                aux[i] = "b";
            } else if (aux[i].equals("7")) {
                aux[i] = "T";
            } else if (aux[i].equals("8")) {
                aux[i] = "B";
            } else if (aux[i].equals("9")) {
                aux[i] = "g";
            } else if (aux[i].equals("0")) {
                aux[i] = "o";
            }
        }

        for (int index = 0; index < aux.length; index++) {
            System.out.print(aux[index]);
        }

        System.out.println(" ");

        scanner.close();
    }
}