import java.util.Scanner;

public class Backspace{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		int i;

		for(i = 1; i < input.length(); i++){
			if(input.charAt(i) == '<'){
				input = input.substring(0, i - 1) + input.substring(i + 1);
				i = i - 2;
			}
		}

		System.out.println(input);
		

	}
}