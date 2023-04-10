import java.util.Scanner;

// title of problem: The Easiest Problem Is This One
public class Harshad{
 
	public static int getSumOfDigits(long num){
		int sum = 0;

		while(num > 0){
			sum += num % 10;
			num /= 10;
		}

		return sum;
	}

	public static boolean isHarshad(int num){
		if(num % getSumOfDigits(num) == 0)
			return true;
		else return false;
	}


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		boolean isDone = false;

		for(i = n; i <= Integer.MAX_VALUE && !isDone; i++)
			if(isHarshad(i)){
				isDone = true;
				System.out.println(i);
			}

		sc.close();
	}
}