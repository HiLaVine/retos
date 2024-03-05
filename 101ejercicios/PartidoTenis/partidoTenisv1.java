/*
 * Escribe un programa que muestre cómo transcurre un juego de tenis y quién lo ha ganado.
 * El programa recibirá una secuencia formada por "P1" (Player 1) o "P2" (Player 2), según quien
 * gane cada punto del juego.
 * 
 * - Las puntuaciones de un juego son "Love" (cero), 15, 30, 40, "Deuce" (empate), ventaja.
 * - Ante la secuencia [P1,P1,P2,P2,P1,P2,P1,P1], el programa mostraría lo siguiente:
 *   15 - Love
 *   30 - Love
 *   30 - 15
 *   30 - 30
 *   40 - 30
 *   Deuce
 *   Ventaja P1
 *   Ha ganado el P1
 * - Si quieres, puedes controlar errores en la entrada de datos.   
 * - Consulta las reglas del juego si tienes dudas sobre el sistema de puntos.   
 */

import java.util.Scanner;

public class partidoTenisv1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String entradaPartido = scanner.nextLine().toLowerCase();

        String[] numerosString = entradaPartido.split(",");

        String[] numeros = new String[numerosString.length];

        String p1 = "Love";
        String p2 = "Love";
        String resultado = "a";

        for (int i = 0; i < numerosString.length; i++) {
            numeros[i] = numerosString[i];
        }

        System.out.println(p1 + " - " + p2);

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i].equals("p1")) {
                if (p1.equals("Love")) {
                    p1 = "15";
                    System.out.println(p1 + " - " + p2);
                } else if (p1.equals("15")) {
                    p1 = "30";
                    System.out.println(p1 + " - " + p2);
                } else if (p1.equals("30")) {
                    if (p2.equals("40")) {
                        p1 = "Deuce";
                        p2 = "Deuce";
                        System.out.println("Deuce");
                    } else {
                        p1 = "40";
                        System.out.println(p1 + " - " + p2);
                    }
                } else if (p1.equals("40") && p2.equals("30")) {
                    resultado = "Ha ganado el P1";
                    System.out.println(resultado);
                    break;
                } else if (p1.equals("40") && p2.equals("40")) {
                    p1 = "Deuce";
                    p2 = "Deuce";
                    System.out.println("Deuce");
                } else if (p1.equals("30") && p2.equals("40")) {
                    p1 = "Deuce";
                    p2 = "Deuce";
                    System.out.println("Deuce");
                } else if (p1.equals("Deuce") && p2.equals("Deuce")) {
                    p1 = "Ventaja";
                    p2 = "Deuce";
                    System.out.println("Ventaja p1");
                } else if (p1.equals("Deuce") && p2.equals("Ventaja")) {
                    p1 = "Deuce";
                    p2 = "Deuce";
                    System.out.println("Deuce");

                } else {
                    resultado = "Ha ganado el P1";
                    System.out.println(resultado);
                    break;
                }
            } else if (numeros[i].equals("p2")) {
                if (p2.equals("Love")) {
                    p2 = "15";
                    System.out.println(p1 + " - " + p2);
                } else if (p2.equals("15")) {
                    p2 = "30";
                    System.out.println(p1 + " - " + p2);
                } else if (p2.equals("30")) {
                    if (p1.equals("40")) {
                        p1 = "Deuce";
                        p2 = "Deuce";
                        System.out.println("Deuce");
                    } else {
                        p2 = "40";
                        System.out.println(p1 + " - " + p2);
                    }
                } else if (p1.equals("30") && p2.equals("40")) {
                    resultado = "Ha ganado el P2";
                    System.out.println(resultado);
                    break;
                } else if (p2.equals("30") && p1.equals("40")) {
                    p1 = "Deuce";
                    p2 = "Deuce";
                    System.out.println("Deuce");

                } else if (p1.equals("Deuce") && p2.equals("Deuce")) {
                    p1 = "Deuce";
                    p2 = "Ventaja";
                    System.out.println("Ventaja p2");
                } else if (p1.equals("Ventaja") && p2.equals("Deuce")) {
                    p1 = "Deuce";
                    p2 = "Deuce";
                    System.out.println("Deuce");

                } else {
                    resultado = "Ha ganado el P2";
                    System.out.println(resultado);
                    break;
                }

            }

        }

        scanner.close();

    }

}
