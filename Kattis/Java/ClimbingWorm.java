import java.util.Scanner;

public class ClimbingWorm{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();

		int currSpot = 0;
		int count = 0;

		while(currSpot < h){
			currSpot += a;

			if(currSpot < h)
				currSpot -= b;

			count++;
		}

		System.out.println(count);
		sc.close();
	}
}