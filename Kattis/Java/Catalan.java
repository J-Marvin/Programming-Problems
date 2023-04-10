import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Catalan{
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger[] factorial = new BigInteger[10001];
        
        for(int i = 0; i <= 10000; i++){
            if(i <= 1)
                factorial[i] = BigInteger.valueOf(1);
            else factorial[i] = factorial[i - 1].multiply(BigInteger.valueOf(i));
        }

        int q = Integer.parseInt(br.readLine());

        for(int i = 0; i < q; i++){
            int n = Integer.parseInt(br.readLine());

            BigInteger c = factorial[2 * n];
            c = c.divide(factorial[n + 1].multiply(factorial[n]));

            System.out.println(c);
        }

    }
}