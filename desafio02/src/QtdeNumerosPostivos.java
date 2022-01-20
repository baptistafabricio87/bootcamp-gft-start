import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QtdeNumerosPostivos {
    public static void main(String[] args) throws IOException {
        String linha;
        Double n;
        int pos = 0, i;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (i = 0; i <= 5; i++) {
            linha = br.readLine();
            n = Double.parseDouble(linha);
            if(n >= 0) pos++;
        }

        System.out.println("" + pos + " valores positivos");
    }
}
