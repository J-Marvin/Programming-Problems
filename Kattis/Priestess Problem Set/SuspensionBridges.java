import java.util.Scanner;
import java.lang.Math;

public class SuspensionBridges{
	
	public static double binarySearch(double min, double max, double d, double s){
		double res;
		double low = min;
		double high = max;
		double mid = low + (high - low) / 2;

		while(low < high){
			mid = (high + low) / 2;
			res = mid * Math.cosh(d / (mid * 2)) - mid - s;

			if(Math.abs(res) < 0.000001)
				return mid;
			else if(res > 0)
				low = mid;
			else high = mid;
		}

		return mid;

	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double d = sc.nextInt(); 
		double s = sc.nextInt(); 
		double  a = binarySearch(0, Double.MAX_VALUE, d, s);
		double l = 2*a * Math.sinh(d / (2 * a));

		System.out.println(l);


		sc.close();
	}
}