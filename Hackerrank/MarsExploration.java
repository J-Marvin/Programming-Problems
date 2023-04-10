import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MarsExploration {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        int mes = line.length() / 3;
        int count = 0;

        for(int i = 0; i < mes; i++){
            String temp = line.substring(3 * i, 3 * i + 3);
            for(int j = 0; j < 3; j++){
                if(j % 2 == 0){
                    if(temp.charAt(j) != 'S')
                        count++;
                } else
                    if(temp.charAt(j) != 'O')
                        count++;
            }
        }

        System.out.println(count);
    }
}
