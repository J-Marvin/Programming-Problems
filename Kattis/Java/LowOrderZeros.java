import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LowOrderZeros {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x;
        int[] memo = new int[(int)1e6 + 1];
        int f = 1;

        for(int i = 1; i <= 1e6; i++){
            if(i == 1)
                memo[i] = 1;
            else{
                memo[i] = memo[i - 1] * i;

                while(memo[i] % 10 == 0)
                    memo[i] /= 10;

                memo[i] %= 10;
            }

        }

        do{
            x = Integer.parseInt(br.readLine());
            System.out.println(memo[x]);
        } while(x != 0);
    }
}
