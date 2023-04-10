import java.util.Scanner;

public class MethodicMultiplication{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String line1 = sc.nextLine();
		String line2 = sc.nextLine();

		int num1 = line1.indexOf("0") / 2;
		int num2 = line2.indexOf("0") / 2;

		int product = num1 * num2;
		int i;

		for(i = 0; i < product; i++)
			System.out.print("S(");

		System.out.print("0");

		for(i = 0; i < product; i++)
			System.out.print(")");
		
		sc.close();
	}
}