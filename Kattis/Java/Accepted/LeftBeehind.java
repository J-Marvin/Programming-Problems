import java.util.Scanner;

public class LeftBeehind{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int x, y;

		do{
			x = sc.nextInt();
			y = sc.nextInt();

			if(x != 0 || y != 0){
				if(x + y == 13)
					System.out.println("Never speak again.");
				else if(y > x)
					System.out.println("Left beehind.");
				else if(x > y)
					System.out.println("To the convention.");
				else if(x == y)
					System.out.println("Undecided.");
			}

		} while(x != 0 || y != 0);
	}
}