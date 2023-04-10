import java.util.Scanner;

public class SpeedLimit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int ctr = 1;
		boolean done = false;
		int n;
		int i;
		int time;
		int totalTime;
		int distance;
		int totalDistance;

		while(ctr != 10 && !done){

			n = sc.nextInt();
			if(n == -1)
				done = true;
			else{				
				totalDistance = 0;
				totalTime = 0;

				for(i = 0; i < n; i++){
					distance = sc.nextInt();
					time = sc.nextInt();
					totalDistance += distance * (time - totalTime);
					totalTime += time - totalTime; 
				}

				System.out.println(totalDistance + " miles");
			}

			ctr++;
		}

		sc.close();
	}
}