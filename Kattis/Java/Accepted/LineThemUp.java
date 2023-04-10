import java.util.Scanner;
import java.util.ArrayList;

public class LineThemUp{
	
	public static boolean isIncreasing(ArrayList<String> names){

		int i;

		for(i = 0; i < names.size() - 1; i++)
			if(names.get(i).compareTo(names.get(i + 1)) > 0)
				return false;

		return true;
	}

	public static boolean isDecreasing(ArrayList<String> names){

		int i;

		for(i = 1; i < names.size(); i++)
			if(names.get(i - 1).compareTo(names.get(i)) < 0)
				return false;

		return true;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<String> names = new ArrayList<String>();
		int i;

		for(i = 0; i < n; i++)
			names.add(sc.nextLine());

		if(isIncreasing(names))
			System.out.println("INCREASING");
		else if(isDecreasing(names))
			System.out.println("DECREASING");
		else System.out.println("NEITHER");
	}
}