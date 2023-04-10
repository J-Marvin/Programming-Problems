import java.util.Scanner;
// FULL PROBLEM NAME: Just a Minute
public class Minute{

	public static double getAverage(int[][] times){
		int i;
		double sumDisplay = 0;
		double sumActual = 0;
		for(i = 0; i < times.length; i++){
			sumDisplay += times[i][0];
			sumActual += times[i][1];
		}

		return sumActual / (sumDisplay * 60);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] time = new int[n][2];
		double average;
		int i;

		for(i = 0; i < n; i++){
			time[i][0] = sc.nextInt();
			time[i][1] = sc.nextInt();
		}

		average = getAverage(time);

		if(average < 1)
			System.out.println("measurement error");
		else System.out.println(average);

		sc.close();
	}
}