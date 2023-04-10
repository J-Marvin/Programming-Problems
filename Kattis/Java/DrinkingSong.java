import java.util.*;

public class DrinkingSong{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String drink = sc.nextLine();

		int i;

		for(i = n; i > 0; i--){
			if(i > 1)
				System.out.println(i + " bottles of " + drink + " on the wall, " + i + " bottles of " + drink + ".");
			else System.out.println(i + " bottle of " + drink + " on the wall, " + i + " bottle of " + drink + ".");

			if(i > 2)
				System.out.println("Take one down, pass it around, " + (i - 1) + " bottles of " + drink + " on the wall.");
			else if(i == 2)
				System.out.println("Take one down, pass it around, " + (i - 1) + " bottle of " + drink + " on the wall.");
			else System.out.println("Take it down, pass it around, no more bottles of " + drink + ".");

			System.out.println();
		}	
	}
} 