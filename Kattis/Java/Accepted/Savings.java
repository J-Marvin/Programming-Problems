import java.util.Scanner;
import java.lang.Math;

// title of problem: Saving For Retirement
public class Savings{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int bob_age = sc.nextInt();
		int bob_retire = sc.nextInt();
		int bob_savings = sc.nextInt();
		int alice_age = sc.nextInt();
		int alice_savings = sc.nextInt();
		int alice_retire;

		int bob_total = (bob_retire - bob_age) * bob_savings;
		alice_retire = alice_age + (int)Math.ceil(bob_total * 1.0 / alice_savings);

		if(bob_total == alice_savings * (alice_retire - alice_age))
			alice_retire ++;

		System.out.println(alice_retire);
		sc.close();
	}
}