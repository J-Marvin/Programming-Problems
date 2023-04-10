import java.util.Scanner;
import java.math.BigInteger; 

public class DifferentProblem{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i;
		String[] input;
		BigInteger num1;
		BigInteger num2;

		while(sc.hasNextLine()) {
			input = sc.nextLine().split(" ");
			num1 = new BigInteger(input[0]);
			num2 = new BigInteger(input[1]);
			System.out.println(num1.subtract(num2).abs());

		}


		sc.close();
	}
}