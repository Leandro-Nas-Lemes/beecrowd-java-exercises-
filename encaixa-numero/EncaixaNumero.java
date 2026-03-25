import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {

            String A = sc.next();
            String B = sc.next();

            if (A.endsWith(B)) {
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }
        }
    }
}
