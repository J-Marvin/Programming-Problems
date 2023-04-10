import java.util.Scanner;
import java.lang.Math;

public class RoamingRomans{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float n = sc.nextFloat();

		System.out.println(Math.round( n * 1000 * 1.0 * 5280 / 4854));

		sc.close();
	}
}