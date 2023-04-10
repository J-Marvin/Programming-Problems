import java.util.Scanner;

public class JumbledCommunication{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i;
		int b;
		int b1;

		for(i = 0; i < n; i++){
			b = sc.nextInt();
			System.out.println(b ^ (b << 1));
		}
	}
} 