import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class CaesarCipher {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String line  = br.readLine();
        int k = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < n; i++){
            char temp = line.charAt(i);
            if(temp >= 'a' && temp <= 'z'){
                temp -= 'a';
                temp += k;
                temp %= 26;
                temp += 'a';
            } else if(temp >= 'A' && temp <= 'Z'){
                temp -= 'A';
                temp += k;
                temp %= 26;
                temp += 'A';
            }

            sb.append(temp);
        }

        System.out.println(sb);
    }
}
