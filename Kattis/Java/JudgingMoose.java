import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JudgingMoose {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] parts = br.readLine().split(" ");

        int left = Integer.parseInt(parts[0]);
        int right = Integer.parseInt(parts[1]);

        if(left == 0 && right == 0)
            System.out.println("Not a moose");
        else if(left == right){
            System.out.println("Even " + (left * 2));
        } else{
            System.out.println("Odd " + (Math.max(left, right) * 2));
        }
    }
}
