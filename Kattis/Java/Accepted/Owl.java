import java.util.Scanner;

// title of problem: The Owl and the Fox
public class Owl{
 
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
		int t = sc.nextInt();

		int n;
		int i;
		int j;
		boolean isDone;
		int sum;

		for(i = 0; i < t; i++){
			n = sc.nextInt();
			sum = getSumOfDigits(n);
			isDone = false;

			for(j = n - 1; j >= 0 && !isDone; j--){
				if(getSumOfDigits(j) == sum - 1){
					System.out.println(j);
					isDone = true;
				}
			}

		}

		sc.close();
	}
}