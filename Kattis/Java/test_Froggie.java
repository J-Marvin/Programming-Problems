import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class Froggie{

	static class Frog{

		int x;
		int y = l;

		public Frog(int x){
			this.x = x;
		}

		public void move(char dir){

			switch(dir){
				case 'U':
					y--; 
					break;
				case 'L':
					if(x - 1 >= 0)
						x --;
					break;
				case 'R':
					if(y + 1 < w)
						x ++;
					break;
				case 'D':
					if(y + 1 < l)
						y++;
			}
		}
	}

	static class Car{
		int position;
		int interval;
		int speed;
		boolean goingRight;

		public Car(int offset, int interval, int speed, boolean goingRight){
			if(goingRight)
				this.position = offset;
			else this.position = w - 1 - offset;

			this.interval = interval;
			this.speed = speed;
			this.goingRight = goingRight;
		}

	}

	static int l;
	static int w;
	static int start;
	static String moves;
	static int[][] rows;

	public static String checkWin(){

		int i;
		Frog frog = new Frog(start);
		int currentPos;
		ArrayList<Car> cars = new ArrayList<Car>();

		for(i = 0; i < rows.length; i++){

			if(i % 2 == 0){
				System.out.println(" TRUE ");
				cars.add(new Car(rows[i][0], rows[i][1], rows[i][2], true));
			}
			else cars.add(new Car(rows[i][0], rows[i][1], rows[i][2], false));

		}

		displayBoard(frog, cars, 0);

		for(i = 0; i < moves.length(); i++){
			frog.move(moves.charAt(i));

			if(frog.y == -1)
				return "safe";

			if(frog.y < l){
				Car currCar = cars.get(frog.y);

				if(currCar.goingRight){
					currentPos = (currCar.position + (i + 1) * currCar.speed) % w;
				}
				else{
					currentPos = (currCar.position - (i + 1) * currCar.speed) % w;
				}

				if(Math.abs(frog.x - currentPos) % currCar.interval == 0)
					return "squish";
				else if(Math.abs(frog.x - currentPos) % currCar.interval < currCar.speed && Math.abs(frog.x - currentPos) % currCar.interval > 0)
					return "squish"; 
			}

			displayBoard(frog, cars, i + 1);

		}

		return "squish"; 
	}

	//FOR ERROR CHECKING
	static void displayBoard(Frog frog, ArrayList<Car> cars, int turn){

		int i;
		int j;
		int currentPos;

		// for(i = 0; i < l; i++){
		// 	Car currCar = cars.get(i);

		// 	System.out.println((i + 1) + " CAR INFO: ");
		// 	System.out.println("offset is " + currCar.position);
		// 	System.out.println("interval is " + currCar.interval);
		// 	System.out.println("speed is " + currCar.speed);
		// 	if(currCar.goingRight)
		// 		currentPos = (currCar.position + turn * currCar.speed) % (w);
		// 	else {
		// 		currentPos = (currCar.position - turn * currCar.speed) % (w);
		// 		if(currentPos < 0)
		// 			currentPos = (w - 1) - Math.abs(currentPos) % (w);
		// 	}

		// 	System.out.println(" currentPos is " + currentPos);
		// 	System.out.println();
		// }

		System.out.println("TURN " + turn);
		System.out.println("BOARD------------------------------------");
		for(i = 0; i < l; i++){

			for(j = 0; j < w; j++){

				if(frog.y == i && frog.x == j)
					System.out.print("F ");
				else{
					Car currCar = cars.get(i);
					if(currCar.goingRight)
						currentPos = (currCar.position + turn * currCar.speed) % w;
					else {
						currentPos = (currCar.position - turn * currCar.speed) % w;
						if(currentPos < 0)
							currentPos = (w - 1) - Math.abs(currentPos) % w;
					}
					if(currentPos == j)
						System.out.print("C ");
					else System.out.print("- ");
				}
				


			}
			System.out.println();
		}

		System.out.println();
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String[] input = sc.nextLine().split(" ");
		l = Integer.parseInt(input[0]);
		w = Integer.parseInt(input[1]);

		rows = new int[l][3]; 
		int i;

		for(i = 0; i < l; i++){
			input = sc.nextLine().split(" ");
			rows[i][0] = Integer.parseInt(input[0]);
			rows[i][1] = Integer.parseInt(input[1]);
			rows[i][2] = Integer.parseInt(input[2]);
		}

		input = sc.nextLine().split(" ");
		start = Integer.parseInt(input[0]);
		moves = input[1];

		System.out.println(checkWin());
	}
}