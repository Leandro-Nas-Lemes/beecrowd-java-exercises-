import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt();

        for(int i = 0; i < N; i++) {
            int x = scn.nextInt();
            int y = scn.nextInt();

            int r = (3 * x) * (3 * x) + (y * y);
            int b = 2 * (x * x) + (5 * y) * (5 * y);
            int c = -100 * x + (y * y * y);

            if (r > b && r > c) {
                System.out.println("Rafael ganhou");
            } else if (b > r && b > c) {
                System.out.println("Beto ganhou");
            } else {
                System.out.println("Carlos ganhou");
            }
        }
    }
}
