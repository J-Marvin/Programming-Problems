import java.util.Scanner;
import java.util.ArrayList;

public class DigitProduct{

	public static int getDigitProduct(int n){

		int product;
		while(n / 10 != 0){
			product = 1;

			while(n > 0){
				if(n % 10 != 0)
					product *= n % 10;

				n /= 10;
			}

			n = product;
		}

		return n;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println(getDigitProduct(num));

	}
}