import java.util.Scanner;

public class FizzBuzz{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int n = sc.nextInt();
		int i;

		boolean isDivisible;
		String status;

		for(i = 1; i <= n; i++){
			status = "";
			isDivisible = false;

			if(i % x == 0){
				isDivisible = true;
				status += "Fizz";
			}
			if(i % y == 0){
				isDivisible = true;
				status += "Buzz";
			}

			if(isDivisible)
				System.out.println(status);
			else System.out.println(i);
		}

		sc.close();
	}
}