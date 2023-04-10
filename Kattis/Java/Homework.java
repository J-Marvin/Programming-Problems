import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] parts = br.readLine().trim().split(";");
        int count = 0;

        for(int i = 0; i < parts.length; i++){
            if(parts[i].contains("-")){
                String[] nums = parts[i].split("-");

                count += Integer.parseInt(nums[1]) - Integer.parseInt(nums[0]) + 1;
            } else{
                count++;
            }
        }

        System.out.println(count);

    }

}
