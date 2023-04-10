import java.util.Scanner;

public class SimonSays{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		int i;
		String sound;
		String input;


		for(i = 0; i < n; i++){
			input = sc.nextLine();
			if(input.startsWith("simon says"))
				System.out.println(input.substring(10));
		}
	}
} 