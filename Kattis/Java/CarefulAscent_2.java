import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class CarefulAscent_2{

	public static double getDistance(double rate, double[][] speeds){
		double distance = 0;

		int i;

		for(i = 0; i < speeds.length; i++)
			distance += speeds[i][0] * speeds[i][1] * rate;

		return distance;
	}

	public static double lower_bound(double min, double max, int x, double[][] rate){
		double low = min;
		double high = max;
		double mid;
		double distance;

		while(low < high){
			mid = (high + low) / 2;
			distance = getDistance(mid, rate);

			System.out.println("MID is " + mid);
			System.out.println("DISTANCE is " + distance);

			if(distance == x)
				return mid;
			else if(distance > x)
				high = mid;
			else low = mid + 1;
		}

		return low;
	}

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

		double[][] speed = new double[nShields + 1][2];

		for(i = 0; i < nShields; i++){
			shieldStart = sc.nextInt();
			shieldEnd = sc.nextInt();
			factor = sc.nextDouble();

			speed[i][0] = shieldEnd - shieldStart;
			speed[i][1] = factor;

			y -= shieldEnd - shieldStart;
		}
		System.out.println("Y IS " + y);
		speed[i][0] = y;
		speed[i][1] = 1;

		double n = lower_bound(0, 10000000, x, speed);
		System.out.println(n);
		System.out.println("DISTANCE IS " + getDistance(1, speed));

		sc.close();
	}
}