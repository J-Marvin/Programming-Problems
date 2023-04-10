import java.util.*;

public class Mia{

	public static int winner(int s0, int s1, int r0, int r1){

		int player1;
		int player2;

		if(s0 > s1)
			player1 = s0 * 10 + s1;
		else
			player1 = s1 * 10 + s0;

		if(r0 > r1)
			player2 = r0 * 10 + r1;
		else 
			player2 = r1 * 10 + r0;

		if(player1 == 21){
			if(player2 == 21)
				return 0;
			else return 1;
		}
		else if(player2 == 21){
			if(player1 == 21)
				return 0;
			else return 2;
		}

		if(player1 % 11 == 0 && player2 % 11 != 0)
			return 1;
		else if(player2 % 11 == 0 && player1 % 11 != 0)
			return 2;

		if(player1 > player2)
			return 1;
		else if(player2 > player1)
			return 2;
		else return 0;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int s0, s1, r0, r1, w;

		do{
			s0 = sc.nextInt();
			s1 = sc.nextInt();
			r0 = sc.nextInt();
			r1 = sc.nextInt();

			if(s0 != 0 && s1 != 0 && r0 != 0 && r1 != 0){
				w = winner(s0, s1, r0, r1);

				if(w == 1)
					System.out.println("Player 1 wins.");
				else if(w == 2)
					System.out.println("Player 2 wins.");
				else System.out.println("Tie.");
			}
		} while(s0 != 0 && s1 != 0 && r0 != 0 && r1 != 0);
	}
}