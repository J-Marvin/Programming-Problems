import java.util.Scanner;
import java.util.Arrays;

public class Egypt{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String[] input;
		int a, b, c;

		do{
			 input = sc.nextLine().split(" ");

			 a = Integer.parseInt(input[0]);
			 b = Integer.parseInt(input[1]);
			 c = Integer.parseInt(input[2]);

			 if(a != 0 && b != 0 && c != 0){
			 	if(a * a + b * b == c * c)
			 		System.out.println("right");
			 	else System.out.println("wrong");
			 }

		} while( a != 0 && b != 0 && c != 0);

		sc.close();
	}
} 