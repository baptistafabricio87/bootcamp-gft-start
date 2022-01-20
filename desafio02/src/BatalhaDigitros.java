import java.io.IOException;
import java.util.Scanner;

public class BatalhaDigitros {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int b, a1, d1, l1, a2, d2, l2, v1, v2;

        for (int i = 0; i < t; i++) {
            b = sc.nextInt();
            a1 = sc.nextInt();
            d1 = sc.nextInt();
            l1 = sc.nextInt();
            a2 = sc.nextInt();
            d2 = sc.nextInt();
            l2 = sc.nextInt();

            v1 = ((a1 + d1) /2) + (l1 % 2 == 0 ? b : 0);
            v2 = ((a2 + d2) /2) + (l2 % 2 == 0 ? b : 0);

            if (v1 > v2) System.out.println("Bruno");
            else if (v2 > v1) System.out.println("Guarte");
            else System.out.println("Empate");
        }
    }
}
