import java.util.Scanner;

public class SoftPasswords{

	public static String reverse(String word){
		int i;
		String reverse = "";
		char letter;
		for(i = 0; i < word.length(); i++){
			if(word.charAt(i) <= 'Z' && word.charAt(i) >= 'A'){
				letter = (char)(word.charAt(i) + ('a' - 'A'));
				reverse += letter;
			}
			else if(word.charAt(i) <= 'z' && word.charAt(i) >= 'a'){
				letter = (char)(word.charAt(i) - ('a' - 'A'));
				reverse += letter;
			}
			else reverse += word.charAt(i);
		}
		return reverse;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();
		String p = sc.nextLine();

		if(p.length() < s.length() - 1)
			System.out.println("No");
		else if(s.length() - p.length() == 1){

			if(p.equals(s.substring(1))){
				if(s.charAt(0) >= '0' && s.charAt(0) <= '9')
					System.out.println("Yes");
				else System.out.println("No");
			}
			else if(p.equals(s.substring(0, s.length() - 1))){
				if(s.charAt(s.length() - 1) >= '0' && s.charAt(s.length() - 1) <= '9')
					System.out.println("Yes");
				else System.out.println("No");
			}
			else System.out.println("No");
		} else{
			if(s.equals(p))
				System.out.println("Yes");
			else if(reverse(p).equals(s))
				System.out.println("Yes");
			else System.out.println("No");
		}
	}

}