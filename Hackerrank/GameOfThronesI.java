import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class GameOfThronesI {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<Character, Integer> letters = new HashMap<>();
        String line = br.readLine();
        for(int i = 0; i < line.length(); i++){
            char temp = line.charAt(i);

            if(letters.containsKey(temp))
                letters.put(temp, letters.get(temp) + 1);
            else{
                letters.put(temp, 1);
            }
        }

        if(line.length() % 2 == 0){
            boolean odd = false;

            for(Map.Entry<Character, Integer> e : letters.entrySet())
                if(e.getValue() % 2 == 1)
                    odd = true;

            if(odd)
                System.out.println("NO");
            else System.out.println("YES");

        } else{
            int odd = 0;

            for(Map.Entry<Character, Integer> e : letters.entrySet())
                if(e.getValue() % 2 == 1)
                    odd++;

            if(odd <= 1)
                System.out.println("YES");
            else System.out.println("NO");
        }

        br.close();
    }
}
