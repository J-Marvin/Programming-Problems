import java.util.Scanner;

// title of problem: The Easiest Problem Is This One
public class Easiest{
 
	public static int getSumOfDigits(long num){
		int sum = 0;

		while(num > 0){
			sum += num % 10;
			num /= 10;
		}

		return sum;
	}


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		int i;
		boolean found;
		int sum_digits;

		do{
			n = sc.nextInt();

			if(n != 0){
				sum_digits = getSumOfDigits(n);
				found = false;
				for(i = 11; i < 1000000000 && !found; i++)
					if(sum_digits == getSumOfDigits(i * n)){
						System.out.println(i);
						found = true;
					}
			}
		} while(n != 0);
		

		sc.close();
	}
}