import java.util.Scanner;

public class MultiplicacaoSimples {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, prod;

        a = sc.nextInt();
        b = sc.nextInt();

        prod = a * b; //implemente o código que representa a multiplicação.

        System.out.println("PROD = " + prod);

        sc.close();
    }
}
