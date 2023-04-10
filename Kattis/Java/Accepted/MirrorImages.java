import java.lang.StringBuilder;
import java.util.*;
 
class MirrorImages{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int i;
        int j;
        int r; 
        int c;
        String[] input;
        StringBuilder[] reverse; 

        for(i = 0; i < n; i++){
            input = sc.nextLine().split(" ");
            r = Integer.parseInt(input[0]);
            c = Integer.parseInt(input[1]);

            reverse = new StringBuilder[r];

            for(j = 0; j < r; j++){
                reverse[j] = new StringBuilder(sc.nextLine());
                reverse[j] = reverse[j].reverse();
            }

            System.out.println("Test " + (i + 1));
            for(j = r - 1; j >= 0; j--)
                System.out.println(reverse[j]);
            
        }
    }
}