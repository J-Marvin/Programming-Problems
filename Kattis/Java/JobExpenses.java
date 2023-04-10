import java.util.Scanner;

public class JobExpenses{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		int i;
		int expenses = 0;
		int temp;
		String input[] = sc.nextLine().split(" ");

		for(i = 0; i < n; i++){
			temp = Integer.parseInt(input[i]);

			if(temp < 0)
				expenses += temp;
		}

		expenses *= -1;

		System.out.println(expenses);
	}
}