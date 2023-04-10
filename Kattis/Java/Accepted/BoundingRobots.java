import java.util.Scanner;
import java.util.Arrays;

public class BoundingRobots{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String[] input;
		int w;
		int l;
		int n;
		int i;
		char move;
		int spaces;

		int[] actual = new int[2];
		int[] think = new int[2];

		do {
			input = sc.nextLine().split(" ");
			w = Integer.parseInt(input[0]);
		 	l = Integer.parseInt(input[1]);

			if(w != 0 && l != 0){
				n = Integer.parseInt(sc.nextLine());

				Arrays.fill(actual, 0);
				Arrays.fill(think, 0);

				for(i = 0; i < n; i++){
					input = sc.nextLine().split(" ");
					move = input[0].charAt(0);
					spaces = Integer.parseInt(input[1]);

					switch(move){
						case 'u': 
								think[1] += spaces;
								actual[1] += spaces;

								if(actual[1] > l - 1)
									actual[1] = l - 1;
								break;
						case 'd': 
								think[1] -= spaces;
								actual[1] -= spaces;

								if(actual[1] < 0)
									actual[1] = 0;
								break;
						case 'l': 
								think[0] -= spaces;
								actual[0] -= spaces;

								if(actual[0] < 0)
									actual[0] = 0;
								break;
						case 'r': 
								think[0] += spaces;
								actual[0] += spaces;

								if(actual[0] > w - 1)
									actual[0] = w - 1;
					}
				}

				System.out.println("Robot thinks " + think[0] + " " + think[1]);
				System.out.println("Actually at " + actual[0] + " " + actual[1]);
				System.out.println();
			}
		}while(w != 0 && l != 0);

	}
}