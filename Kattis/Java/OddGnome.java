import java.util.Scanner;

public class OddGnome{

	public static int checkOdd(int[] gnomes){
		int i;

		for(i = 0; i < gnomes.length - 1; i++){
			
			if(gnomes[i + 1] - gnomes[i] < 0)
				return i + 2;
			else if(gnomes[i + 1] - gnomes[i] > 1)
				return i + 1;
		}

		return gnomes.length;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] gnomes;
		int i;
		int j;
		int g;

		for(i = 0; i < n; i++){
			g = sc.nextInt();

			gnomes = new int[g];

			for(j = 0; j < g; j++)
				gnomes[j] = sc.nextInt();

			System.out.println(checkOdd(gnomes));
		}

		sc.close();
	}
}