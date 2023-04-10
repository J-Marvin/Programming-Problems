import java.util.Scanner;

public class SimonSays{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String temp;
		int i;

		for(i = 0; i < n; i++){
			temp = sc.nextLine();

			if(temp.contains("Simon says"))
				System.out.println(temp.substring(11));
		}
	}
}