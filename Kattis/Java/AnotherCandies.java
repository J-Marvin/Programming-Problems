import java.util.Scanner;

public class AnotherCandies{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long candies;

		int t = Integer.parseInt(sc.nextLine());
		int n;
		int i;
		int j;

		for(i = 0; i < t; i++){
			sc.nextLine();
			n = Integer.parseInt(sc.nextLine());
			candies = 0;
			for(j = 0; j < n; j++)
				candies += Long.parseLong(sc.nextLine()) % n;
			
			if(candies % n == 0)
				System.out.println("YES");
			else System.out.println("NO");

		}

	}
}