import java.util.Scanner;

public class StutteringFix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String linha = sc.nextLine();
        String[] palavras = linha.split(" ");

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < palavras.length; i++) {

            String p = palavras[i];

            if (p.length() >= 4) {
                String s1 = p.substring(0, 2);
                String s2 = p.substring(2, 4);

                if (s1.equals(s2)) {
                    p = p.substring(2);
                }
            }

            resultado.append(p);

            if (i < palavras.length - 1) {
                resultado.append(" ");
            }
        }

        System.out.println(resultado);

        sc.close();
    }
}
