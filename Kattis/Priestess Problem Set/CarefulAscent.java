import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class CarefulAscent{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int nShields = sc.nextInt();

		int i;
		int shieldStart;
		int shieldEnd;
		double sum = 0;
		double factor;

		for(i = 0; i < nShields; i++){
			shieldStart = sc.nextInt();
			shieldEnd = sc.nextInt();
			factor = sc.nextDouble();

			sum += (shieldEnd - shieldStart) * factor;
			y -= shieldEnd - shieldStart;
		}

		System.out.println(x / (sum + y));

		sc.close();
	}
}