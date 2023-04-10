import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Modulo {

    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int count = 0;

        boolean[] mod = new boolean[42];

        Arrays.fill(mod, false);

        for(int i = 0; i < 10; i++){
            int n = sc.nextInt() % 42;
            if(!mod[n]) {
                mod[n] = true;
                count++;
            }
        }

        System.out.println(count);
    }

}
