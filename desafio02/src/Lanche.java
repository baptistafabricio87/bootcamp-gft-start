import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        int x, y;
        float preco = 0;

        Scanner sc = new Scanner(System.in);
        x =sc.nextInt();
        y =sc.nextInt();

        if(x == 1){
            preco = (float) (4.00 * y);
        }else if(x == 2){
            preco = (float) (4.50 * y);
        }else if(x == 3){
            preco = (float) (5.00 * y);
        }else if(x == 4){
            preco = (float) (2.00 * y);
        }else if(x == 5){
            preco = (float) (1.50 * y);
        }

        System.out.printf("Total: R$ %.2f\n",preco);
    }
}
