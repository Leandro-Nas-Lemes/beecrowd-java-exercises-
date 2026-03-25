import java.util.*;

public class TreePlanting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] T = new int[N];

        for (int i = 0; i < N; i++) {
            T[i] = sc.nextInt();
        }

        Arrays.sort(T);

        int maxDia = 0;

        for (int i = 0; i < N; i++) {
            int crescimento = T[N - 1 - i];
            int dia = crescimento + i + 1;

            if (dia > maxDia) {
                maxDia = dia;
            }
        }

        System.out.println(maxDia + 1);

        sc.close();
    }
}
