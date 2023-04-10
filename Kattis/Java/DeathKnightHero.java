import java.util.Scanner;

public class DeathKnightHero{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		int count = 0;
		int i;
		String input;

		for(i = 0; i < n; i++){
			input = sc.nextLine();

			if(!input.contains("CD"))
				count++;
		}

		System.out.println(count);
		sc.close();
	}
}