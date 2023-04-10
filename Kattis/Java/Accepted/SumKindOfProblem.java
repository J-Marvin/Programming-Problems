import java.util.Scanner;


public class SumKindOfProblem{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();

		int i;
		int k;
		int n;
		int sum;
		int sum_even;
		int sum_odd;
		for(i = 0; i < p; i++){
			k = sc.nextInt();
			n = sc.nextInt();
			sum = n * (n + 1) / 2;
			sum_odd = n * n;
			sum_even = n * (n + 1);
			System.out.println(k + " " + sum + " " + sum_odd + " " + sum_even);
		}

		sc.close();
	}
}