import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class StrongPassword {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String line = br.readLine();
        int size = n;

        if(!Pattern.compile("[A-Z]").matcher(line).find())
            n++;

        if(!Pattern.compile("[0-9]").matcher(line).find())
            n++;

        if(!Pattern.compile("[a-z]").matcher(line).find())
            n++;

        if(!Pattern.compile("[!@#$%^&*()+-]").matcher(line).find())
            n++;

        if(n < 6)
            System.out.println(6 - line.length());
        else System.out.println(n - line.length());


    }
}
