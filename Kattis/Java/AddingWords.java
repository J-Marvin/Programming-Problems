import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AddingWords {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] parts;
        HashMap<String, Long> words = new HashMap<String, Long>();
        boolean isValid;
        long sum = 0;
        boolean adding;

        while(line != null){
            parts = line.split(" ");

            if(parts[0].equals("def")){
                if(words.containsKey(parts[1]))
                    words.replace(parts[1], Long.parseLong(parts[2]));
                else
                    words.put(parts[1], Long.parseLong(parts[2]));
            }
            else if(parts[0].equals("calc")){
                isValid = true;
                adding = true;
                sum = 0;
                for(int i = 1; i < parts.length - 1 && isValid; i++){
                    if(i % 2 == 1){
                        if(!words.containsKey(parts[i])){
                            isValid = false;
                        }
                        else{
                            if(adding)
                                sum += words.get(parts[i]);
                            else sum -= words.get(parts[i]);
                        }
                    } else{
                        if(parts[i].equals("+"))
                            adding = true;
                        else if(parts[i].equals("-"))
                            adding = false;
                    }
                }

                line = line.substring(5);
                if(isValid){
                    if(words.containsValue(sum)){
                        for(Map.Entry<String, Long> entry: words.entrySet()){
                            if(entry.getValue() == sum){
                                System.out.println(line + " " +entry.getKey());
                                break;
                            }
                        }
                    }
                    else{
                        System.out.println(line + " unknown");
                    }
                }
                else
                    System.out.println(line + " unknown");
            }
            else if(parts[0].equals("clear"))
                words.clear();

            line = br.readLine();
        }

        br.close();
    }
}
