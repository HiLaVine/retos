import java.util.Scanner;

public class partidoTenis {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String entradaPartido = scanner.nextLine().toLowerCase();

        String aux[] = new String[entradaPartido.length()];

        for (int i = 0; i < entradaPartido.length(); i++) {
            if (String.valueOf(entradaPartido.charAt(i)).equals(",")) {

            } else {
                aux[i] = String.valueOf(entradaPartido.charAt(i));
            }
        }

        System.out.println(aux);

        scanner.close();

    }
}