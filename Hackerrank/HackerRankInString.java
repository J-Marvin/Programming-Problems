import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class HackerRankInString {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String line = br.readLine();

            if(Pattern.compile("^.*h.*a.*c.*k.*e.*r.*r.*a.*n.*k.*$").matcher(line).find())
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
