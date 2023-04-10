import java.util.Scanner;

public class AlphabetSpam{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		int i;
		int whitespace = 0;
		int lowerChar = 0;
		int upperChar = 0;
		int symbols = 0;

		for(i = 0; i < input.length(); i++){
			if(input.charAt(i) == '_')
				whitespace++;
			else if(input.charAt(i) <= 'Z' && input.charAt(i) >= 'A')
				upperChar++;
			else if(input.charAt(i) <= 'z' && input.charAt(i) >= 'a')
				lowerChar++;
			else symbols++;
		}

		System.out.println(whitespace * 1.0 / input.length());
		System.out.println(lowerChar  * 1.0/ input.length());
		System.out.println(upperChar  * 1.0/ input.length());
		System.out.println(symbols    * 1.0/ input.length());

		sc.close();
	}
}