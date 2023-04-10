import java.util.Scanner;

public class FiftyShadesOfPink{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		int i;
		int count = 0;
		String temp;

		for(i = 0; i < n; i++){
			temp = sc.nextLine().toLowerCase();
			if(temp.contains("rose") || temp.contains("pink"))
				count++;
		}

		if(count > 0)
			System.out.println(count);
		else System.out.println("I must watch Star Wars with my daughter" );
	}
}