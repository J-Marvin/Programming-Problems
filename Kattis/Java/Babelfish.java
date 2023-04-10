import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Babelfish {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] parts;
        HashMap<String, String> dictionary = new HashMap<String, String>();

        while(!line.equals("")){
            parts = line.split(" ");
            dictionary.put(parts[1], parts[0]);
            line = br.readLine();
        }

        line = br.readLine();

        while(line != null){
            System.out.println(dictionary.getOrDefault(line, "eh"));
            line = br.readLine();
        }

        br.close();
    }
}
