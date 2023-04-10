import java.util.Scanner;
import java.lang.Math;

public class AlmostPerfect{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		int i;
		int sum;
		String[] input;


		while(sc.hasNextInt()) {
			n = sc.nextInt();
			if(n == 1)
				System.out.println(n + " not perfect");
			else{
				sum = 1;

				for(i = 2; i <= Math.floor(Math.sqrt(n)); i++){
					if(n % i == 0){
						if(i == n / i)
							sum+= i;
						else{
							sum += i;
							sum += n / i;
						}
					}
				}

				if(sum == n)
					System.out.println(n + " perfect");
				else if(Math.abs(sum - n) <= 2)
					System.out.println(n + " almost perfect");
				else System.out.println(n + " not perfect");
			}
		}


		sc.close();
	}
}