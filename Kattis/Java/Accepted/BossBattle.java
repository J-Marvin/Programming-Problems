import java.util.Scanner;
import java.util.Arrays;

public class BossBattle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if(n >= 4)
			System.out.println( n-2 );
		else System.out.println(1);
	}
}