import java.util.Scanner;

public class TowerConstruction{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i;
		int block = sc.nextInt();
		int nextBlock;
		int towers = 1;

		for(i = 1; i < n; i++){
			nextBlock = sc.nextInt();

			if(nextBlock > block)
				towers++;
			
			block = nextBlock;
		}
		
		System.out.println(towers);
		sc.close();
	}
}