import java.util.Scanner;

public class BabyBites{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] input = sc.nextLine().split(" ");

		int i;
		boolean makesSense = true;

		for(i = 0; i < input.length && makesSense; i++){
			if(!input[i].equals("mumble")){
				if(Integer.parseInt(input[i]) != i + 1)
					makesSense = false;
			}
		}

		if(makesSense)
			System.out.println("makes sense");
		else System.out.println("something is fishy");
		

	}
}