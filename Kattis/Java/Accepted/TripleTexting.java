import java.util.Scanner;

public class TripleTexting{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();

		String[] words = new String[3];

		words[0] = input.substring(0, input.length() / 3);
		words[1] = input.substring(input.length() / 3, input.length() / 3 * 2);
		words[2] = input.substring(input.length() / 3 * 2);

		if(words[0].equalsIgnoreCase(words[1]) || words[0].equalsIgnoreCase(words[2]))
			System.out.println(words[0]);
		else System.out.println(words[1]);

		sc.close();
	}
}