import java.io.IOException;
import java.util.Scanner;

public class FunnyLaughs {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // Lê a risada completa
        String risada = sc.nextLine();

        // String que armazenará apenas as vogais
        String vogais = "";

        for (int i = 0; i < risada.length(); i++) {
            char letra = risada.charAt(i);

            // Filtra apenas vogais, ignorando consoantes
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vogais += letra;
            }
        }

        // Comparação
        boolean engracada = true;

        for (int i = 0; i < vogais.length() / 2; i++) {

            if (vogais.charAt(i) != vogais.charAt(vogais.length() - 1 - i)) {
                engracada = false;
                break; // não precisa continuar verificando
            }
        }

        // Imprimir
        if (engracada) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}
