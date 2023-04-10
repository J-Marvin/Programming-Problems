import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Pangram {

        // Complete the pangrams function below.
        static String pangrams(String s) {

            boolean[] alphabet = new boolean[26];
            Arrays.fill(alphabet, false);
            s = s.trim();
            s = s.replaceAll("[^a-zA-z]", "");
            if(s.length() < 26)
                return "not pangram";

            for(int i = 0; i < s.length(); i++){
                char temp = Character.toLowerCase(s.charAt(i));
                alphabet[temp - 'a'] = true;
            }

            for(int i = 0; i < 26; i++)
                if(!alphabet[i])
                    return "not pangram";

            return "pangram";
        }

        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();

            String result = pangrams(s);

            System.out.println(result);
        }

}
