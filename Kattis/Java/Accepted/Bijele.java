import java.util.Scanner;

public class Bijele{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int[] pieces = {1, 1, 2, 2, 2, 8};

		String[] input = sc.nextLine().split(" ");

		int i;

		for(i = 0; i < pieces.length; i++)
			System.out.print((pieces[i] - Integer.parseInt(input[i])) + " ");
	}
}