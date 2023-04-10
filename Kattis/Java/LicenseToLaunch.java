import java.util.Scanner;

public class LicenseToLaunch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int i;
		int temp;
		int minObstacles;
		int day = 0;

		minObstacles = sc.nextInt();
		day = 0;

		for(i = 1; i < n; i++){
			temp = sc.nextInt();

			if(temp < minObstacles){
				minObstacles = temp;
				day = i;
			}
		}

		System.out.println(day);

		sc.close();
	}
}