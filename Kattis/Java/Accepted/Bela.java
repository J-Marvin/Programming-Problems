import java.util.Scanner;
import java.lang.Math;

public class Bela{

	public static int getScore(String card, char b){

		char val = card.charAt(0);
		char suit = card.charAt(1);

		switch(val){
			case 'A': return 11;
			case 'K': return 4;
			case 'Q': return 3;
			case 'T': return 10;
			case '8':
			case '7': return 0;
			case 'J': if(b == suit)
						return 20;
					  else return 2;
			case '9': if(b == suit)
						return 14;
					  else return 0;
		}

		return 0;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;

		int i;

		String card;
		char b;
		int score = 0;
		String[] input = sc.nextLine().split(" ");

		n = Integer.parseInt(input[0]);
		b = input[1].charAt(0);

		for(i = 0; i < 4 * n; i++){
			card = sc.nextLine();
			score += getScore(card, b);
		}
		
		System.out.println(score);
	}
}