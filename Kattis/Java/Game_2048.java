import java.util.Scanner;

public class Game_2048{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int i;
		int j;
		int move;

		int[][] board = new int[4][4];

		for(i = 0; i < 4; i++)
			for(j = 0; j < 4; j++)
				board[i][j] = sc.nextInt();
		
		move = sc.nextInt();

		switch(move){
			case 1: // left
					// checking
					for(i = 0; i < 4; i++)
						for(j = 0; j < 4; j++){
							if()
						}




					i = 1;

					while(i < 3){
						//moving elements
						if(board[0][i] != 0 && board[0][i - 1] == 0){
							board[0][i - 1] = board[0][i];
							board[0][i] = 0;
						}
					}

					break;
			case 2: // up
 					break;
			case 3: // right
					break;
			case 4: // down
		}
	}
}