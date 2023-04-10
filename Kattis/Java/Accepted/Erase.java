import java.util.Scanner;
import java.lang.Math;

// FULL PROBLEM NAME: Erase Securely
public class Erase{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());

		String s1 = sc.nextLine();
		String s2 = sc.nextLine();

		boolean isValid = true;
		int i;

		for(i =0; i <s1.length() && isValid; i++){

			if(n % 2 == 0){
				if(s1.charAt(i) != s2.charAt(i))
					isValid = false;
			}
			else 
				if(s1.charAt(i) == s2.charAt(i))
					isValid = false;
		}

		if(isValid)
			System.out.println("Deletion succeeded");
		else System.out.println("Deletion failed");

		sc.close();
	}
}