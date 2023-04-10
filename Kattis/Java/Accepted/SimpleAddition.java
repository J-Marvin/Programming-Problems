import java.util.Scanner;
import java.math.BigInteger;

public class SimpleAddition{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		BigInteger op1 = new BigInteger(sc.nextLine());
		BigInteger op2 = new BigInteger(sc.nextLine());
		System.out.println(op1.add(op2));

		sc.close();
	}
} 