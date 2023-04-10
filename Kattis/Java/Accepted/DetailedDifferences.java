import java.util.*;
import java.time.*;

public class DetailedDifferences{

	public static void showDiff(String s1, String s2){
		int i;

		for(i = 0; i < s1.length(); i++)
			if(s1.charAt(i) == s2.charAt(i))
				System.out.print(".");
			else System.out.print("*");

		System.out.println("\n");
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String s1, s2;

		int i;

		for(i = 0; i < n; i++){
			s1 = sc.nextLine();
			s2 = sc.nextLine();

			System.out.println(s1);
			System.out.println(s2);

			showDiff(s1, s2);
		}
		sc.close();
	}
} 