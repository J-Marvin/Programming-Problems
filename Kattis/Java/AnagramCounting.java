import java.util.Scanner;
import java.math.BigInteger; 

public class AnagramCounting{

	public static BigInteger getFactorial(int n){

		int i;
		BigInteger t = new BigInteger("1");

		for(i = 1; i <= n; i++)
			t = t.multiply(BigInteger.valueOf(i));

		return t;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i;
		String input;

		try{
			for(i = 0; i < 500; i++){
				input = sc.nextLine();
				if(input !)
				System.out.println(getFactorial(input.length()));
			}
		} catch(Exception e){
			
		}
		

	}
}