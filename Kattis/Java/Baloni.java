import java.util.Scanner;
import java.util.ArrayList;

public class Baloni{

	static ArrayList<Integer> balloons;
	public static int countArrows(){
		int arrows = 0;
		int arrowHeight = 0;

		int i;

		while(!balloons.isEmpty()){

			arrows++;
			arrowHeight = balloons.get(0) - 1;
			balloons.remove(0);

			for(i = 0; i < balloons.size() && arrowHeight > 0;i ++){
				if(balloons.get(i).intValue() == arrowHeight){
					arrowHeight --;
					balloons.remove(i);
					i--;
				}
			}
		}

		return arrows;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		balloons = new ArrayList<Integer>();


		int i;

		for(i = 0; i < n; i++)
			balloons.add(sc.nextInt());
		
		System.out.println(countArrows());
	}
}