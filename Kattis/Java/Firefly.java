import java.util.Scanner;

public class Firefly{
	
	static int n;
	static int h;
	static int[] obstacles;

	public static int getObstacles(int lane){
		int i;
		int count = 0;
		for(i = 0; i < obstacles.length; i++){
			if(i % 2 == 0){
				if(obstacles[i] >= lane)
					count++;
			}
			else
				if(h - obstacles[i] < lane)
					count++;
		}
		return count;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); //length
		h = sc.nextInt(); //height

		int i;
		int min = n;
		int count = 0;
		int temp;
		obstacles = new int[n];

		for(i = 0; i < n; i++)
			obstacles[i] = sc.nextInt();

		for(i = 0; i < h; i++){
			temp = getObstacles(i + 1);

			if(temp == min)
				count += 1;
			else if(temp < min){
				min = temp;
				count = 1;
			}
		}

		System.out.println(min + " " + count);

		sc.close();
	}
}