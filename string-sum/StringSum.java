import java.util.Scanner;

public class StringSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {

            String linha = sc.nextLine();

            // extrai os três números fixos da string
            int n1 = Integer.parseInt(linha.substring(2, 4));
            int n2 = Integer.parseInt(linha.substring(5, 8));
            int n3 = Integer.parseInt(linha.substring(11, 13));

            int soma = n1 + n2 + n3;

            System.out.println(soma);
        }

        sc.close();
    }
}
