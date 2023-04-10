import java.util.Scanner;

public class IsItHalloween{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String[] input = sc.nextLine().split(" ");

		if(input[0].equals("OCT") && input[1].equals("31"))
			System.out.println("yup");
		else if(input[0].equals("DEC") && input[1].equals("25"))
			System.out.println("yup");
		else System.out.println("nope");

	}
}