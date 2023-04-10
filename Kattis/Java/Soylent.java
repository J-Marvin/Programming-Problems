import java.util.Scanner;
import java.lang.Math;

public class Soylent{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i;
		int req;

		for(i = 0; i < n; i++){
			req = sc.nextInt();

			if(req % 400 == 0)
				req /= 400;
			else req = req / 400 + 1;
			System.out.println(req);
		}

		sc.close();
	}
}