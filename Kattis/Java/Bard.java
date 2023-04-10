import java.util.*;

public class Bard{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int e = Integer.parseInt(sc.nextLine());
		boolean attendance[][] = new boolean[n][e];
		int v;
		int i;
		int j;
		String[] input;
		boolean attend = false;


		for(i = 0; i < n; i++)
			Arrays.fill(attendance[i], false);

		for(i = 0; i < e; i++){
			input = sc.nextLine().split(" ");

			for(j = 0; j < input.length; j++)
				attendance[Integer.parseInt(input[j]) - 1][i] = true;
		}	

		for(i = 0; i < n; i++){

			attend = true;

			for(j = 0; j < e && attend; j++)
				attend = attend && attendance[i][j];
			
			if(attend)
				System.out.println(i + 1);
		}
	}

} 