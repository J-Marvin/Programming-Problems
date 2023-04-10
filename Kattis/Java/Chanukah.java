import java.util.Scanner;
import java.util.Arrays;

public class Chanukah{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();

		int i;
		int k;
		int n;
		int c;

		for(i = 0; i < p; i++){
			k = sc.nextInt();
			n = sc.nextInt();

			c = n * (n + 1) / 2 + n;

			System.out.println(k + " " + c);
		}

		sc.close();
	}
}