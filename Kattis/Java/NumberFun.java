import java.util.Scanner;
import java.lang.Math;

public class NumberFun{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;

		int i;

		int num1;
		int num2;
		int num3;

		n = sc.nextInt();

		for(i = 0; i < n; i++){
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			num3 = sc.nextInt();

			if(num1 + num2 == num3 || num1 * num2 == num3)
				System.out.println("Possible");
			else if(Math.abs(num1 - num2) == num3)
				System.out.println("Possible");
			else{
				if(num1 % num2 == 0 && num1 / num2 == num3)
					System.out.println("Possible");
				else if(num2 % num1 == 0 && num2 / num1 == num3)
					System.out.println("Possible");
				else System.out.println("Impossible");
			}
		}
	}
}