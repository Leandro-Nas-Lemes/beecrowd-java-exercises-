import java.util.Scanner;

public class RocketAttack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int C = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < C; i++) {
            String ataque = sc.nextLine();
            String[] partes = ataque.split("me");

            int countA1 = partes[0].length() - 1;
            int countA2 = partes[1].length() - 1;

            int totalA = countA1 * countA2;

            StringBuilder resultado = new StringBuilder("k");
            for (int j = 0; j < totalA; j++) {
                resultado.append("a");
            }

            System.out.println(resultado);
        }

        sc.close();
    }
}
