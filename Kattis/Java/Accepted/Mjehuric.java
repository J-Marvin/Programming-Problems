import java.util.Scanner;

public class Mjehuric{

	public static void display(int[] num){
		int i;

		for(i = 0; i < num.length; i++)
			System.out.print(num[i] + " ");

		System.out.println();
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int i;
		int temp;
		int j;
		int k;


		for(i = 0; i < 5; i++)
			num[i] = sc.nextInt();

		for(i = 0; i < 5; i++)
			for(j = 0; j < 5 - i - 1; j++)
				if(num[j] > num[j + 1]){
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
					display(num);
				}

		sc.close();
	}
}