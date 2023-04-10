import java.util.Scanner;

public class ToLower{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String input[] = sc.nextLine().split(" ");
		int p = Integer.parseInt(input[0]);
		int t = Integer.parseInt(input[1]);
		int count = 0;
		boolean passed;
		String temp;

		int i, j;

		for(i = 0; i < p; i++){
			passed = true;
			for(j = 0; j < t; j++){
				temp = sc.nextLine();

				if(temp.length() > 1){
					temp = temp.substring(1);
					if(!temp.equals(temp.toLowerCase()))
						passed = false;
				}
			}

			if(passed)
				count++;
		}

		System.out.println(count);

		sc.close();
	}
} 