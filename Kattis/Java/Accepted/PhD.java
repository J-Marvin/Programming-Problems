import java.util.Scanner;
import java.lang.Math;

// FULL PROBLEM NAME: Help a PhD candidate out!
public class PhD{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());

		String equation;
		String input[];

		int i;

		for(i = 0; i < n; i++){
			equation = sc.nextLine();

			if(equation.equals("P=NP"))
				System.out.println("skipped");
			else{
				input = equation.split("\\+");
				System.out.println(Integer.parseInt(input[0]) + Integer.parseInt(input[1]));
			}
		}
	}
}