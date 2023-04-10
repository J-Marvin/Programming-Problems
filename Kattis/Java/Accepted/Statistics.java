import java.util.Scanner;
import java.util.Arrays;

public class Statistics{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] sample;
		int n;
		int i;
		int count = 0;
		while(sc.hasNextInt()){
			count++;
			n = sc.nextInt();

			sample = new int[n];

			for(i = 0; i < n; i++)
				sample[i] = sc.nextInt();
			Arrays.sort(sample);

			System.out.println("Case " + count + ": " + sample[0] + " " + sample[n -1] + " " + (sample[n -1] - sample[0]));
		}
	}
}