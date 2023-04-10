import java.util.Scanner;
import java.math.BigInteger;

public class Buka{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		BigInteger num1 = new BigInteger(sc.nextLine());
		char op = sc.nextLine().charAt(0);
		BigInteger num2 = new BigInteger(sc.nextLine());

		if(op == '+')
			System.out.println(num1.add(num2));
		else System.out.println(num1.multiply(num2));

		sc.close();
	}
}