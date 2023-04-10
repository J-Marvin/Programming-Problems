import java.util.Scanner;
import java.util.ArrayList;

public class BoatParts{


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> parts = new ArrayList<String>();
		int i;
		String part;

		String[] input = sc.nextLine().split(" ");
		int p = Integer.parseInt(input[0]);
		int n = Integer.parseInt(input[1]);
		int day = 0;
		for(i = 0; i < n; i++){
			part = sc.nextLine();

			if(!parts.contains(part)){
				parts.add(part);

				if(parts.size() == p)
					day = i + 1;
			}
		}
		
		if(day == 0)
			System.out.println("paradox avoided");
		else System.out.println(day);
	}
}