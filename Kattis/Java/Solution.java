import java.util.Scanner;
import java.text.*;

public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        
        int c;
        int n;
        int i;
        int j;
        int sum;
        int[] grades;
        double average;
        int count;
        double percentage;
        
        c = sc.nextInt();
        
        for(i = 0; i < c; i++){
            n = sc.nextInt();
            sum = 0;
            grades = new int[n];
            count = 0;
            
            for(j = 0; j < n; j++){
                grades[j] = sc.nextInt();
                sum += grades[j];
            }
            
            average = sum * 1.0 / n;
            for(j = 0; j < n; j++)
                if(grades[j] > average)
                    count++;
                    
            percentage = count * 1.0 / n * 100;
            System.out.println(df.format(percentage) + "%");
        }
        sc.close();
    }
}