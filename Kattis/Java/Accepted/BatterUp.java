import java.util.Scanner;

public class BatterUp{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int total = 0;
		int at_bat = 0;
		int i;
		int temp;

		for(i = 0; i < n; i++){
			temp = sc.nextInt();

			if(temp != -1){
				at_bat += temp;
				total += 1;
			}
		}

		System.out.println(at_bat * 1.0 / total);
	}
}