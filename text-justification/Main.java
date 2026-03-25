import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean primeiro = true;

        while (true) {
            int N = sc.nextInt();

            if (N == 0) break;

            sc.nextLine();

            if (!primeiro) {
                System.out.println();
            }
            primeiro = false;

            String[] linhas = new String[N];
            int maior = 0;

            for (int i = 0; i < N; i++) {
                String linha = sc.nextLine();
                linha = linha.trim().replaceAll("\\s+", " ");
                linhas[i] = linha;

                if (linha.length() > maior) {
                    maior = linha.length();
                }
            }

            for (int i = 0; i < N; i++) {
                int espacos = maior - linhas[i].length();

                String resultado = " ".repeat(espacos) + linhas[i];
                System.out.println(resultado);
            }
        }

        sc.close();
    }
}
