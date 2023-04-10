import java.util.Scanner;

public class Basketball{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		boolean tie = false;
		boolean win = false;
		char winner = ' ';
		int player1 = 0;
		int player2 = 0;

		char player;
		int score;
		int i;

		for(i = 0; i < input.length() && !win; i += 2){
			player = input.charAt(i);
			score = input.charAt(i + 1) - '0';

			if(player == 'A')
				player1 += score;
			else player2 += score;

			if(!tie){
				if(player1 >= 10 && player2 >= 10)
					tie = true;
				else if(player1 == 11){
					winner = 'A';
					win = true;
				} else if(player2 == 11){
					winner = 'B';
					win = true;
				}
			} else{
				if(player1 - player2 >= 2){
					winner = 'A';
					win = true;
				} else if(player2 - player1 >= 2){
					winner = 'B';
					win = true;
				}
			}
			
		}

		System.out.println(winner);
	}
}