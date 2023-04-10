import java.util.Scanner;

public class LastFactorialDigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int i;
		int temp;

		for(i =0; i < n; i++){
			temp = sc.nextInt();

			switch(temp){
				case 1: System.out.println(1);
						break;
				case 2: System.out.println(2);
						break;
				case 3: System.out.println(6);
						break;
				case 4: System.out.println(4);
						break;
				default: System.out.println(0);
			}
		}

		sc.close();
	}
}