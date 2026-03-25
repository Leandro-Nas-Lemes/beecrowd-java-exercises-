import java.util.Scanner;

public class DragonBalls {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();

        for (int i = 0; i < C; i++) {

            int N = sc.nextInt();

            int quadrados = (int) Math.sqrt(N);

            int resultado = N - quadrados;

            System.out.println(resultado);
        }

        sc.close();
    }
}
