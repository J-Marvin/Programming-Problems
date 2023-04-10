import java.util.Scanner;
import java.util.Arrays;
public class QuickBrownFox{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		int i;
		int j;

		boolean[] alphabet = new boolean[26];
		String input;
		char letter;
		boolean isPanagram;

		for(i = 0; i < n; i++){
			input = sc.nextLine().toLowerCase();
			Arrays.fill(alphabet, false);

			isPanagram = true;

			for(j = 0; j < input.length(); j++){
				letter = input.charAt(j);
				if(letter <= 'z' && letter >= 'a')
					alphabet[letter - 'a'] = true;
			}

			for(j = 0; j < 26; j++){
				if(!alphabet[j]){
					if(isPanagram){
						System.out.print("missing ");
						isPanagram = false;
					}
					letter = (char)('a' + j);
					System.out.print(letter);
				}

			}
			if(isPanagram)
				System.out.println("pangram");
			else System.out.println();
		}

		sc.close();
	}
}