import java.util.Scanner;

public class Oddities{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i;
		int num;
		int n = sc.nextInt();

		for(i = 0; i < n; i++){
			num = sc.nextInt();

			if(num % 2 == 0)
				System.out.println(num + " is even");
			else System.out.println(num + " is odd");
		}

		sc.close();
	}
}