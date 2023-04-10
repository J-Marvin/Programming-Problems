import java.util.Scanner;
import java.lang.Math;

// FULL PROBLEM NAME: Honour Thy (Apaxian) Parent
public class ApaxianParent{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input[] = sc.nextLine().split(" ");
		String name;

		if(input[0].charAt(input[0].length() - 1) == 'e')
			name = input[0] + "x" + input[1];
		else if(input[0].charAt(input[0].length() - 1) == 'a' ||
				input[0].charAt(input[0].length() - 1) == 'i' ||
				input[0].charAt(input[0].length() - 1) == 'o' ||
				input[0].charAt(input[0].length() - 1) == 'u')
			name = input[0].substring(0, input[0].length() - 1) + "ex" + input[1];
		else if(input[0].substring(input[0].length() - 2).equals("ex"))
			name = input[0] + input[1];
		else name = input[0] + "ex" + input[1];

		System.out.println(name);
		sc.close();
	}
}