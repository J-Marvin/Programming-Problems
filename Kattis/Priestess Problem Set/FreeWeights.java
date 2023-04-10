import java.util.Scanner;

public class FreeWeights{

	public static boolean withPair(int[] row,  int db){
		int i;
		int prev = 0;

		for(i = 0; i < row.length; i++){
			if(row[i] > db){ //ignore smaller weights kasi assume namove na sila
				if(prev == 0)
					prev = row[i];
				else if(prev != row[i])
					return false;
				else prev = 0;
			}
		}

		if(prev != 0)
			return false;
		else return true;
	}

	public static int binarySearch(int low, int high, int[] row1, int[] row2){
		int mid;

		while(low < high){
			mid = low + (high - low) / 2;

			if(withPair(row1, mid) && withPair(row2, mid))
				high = mid;
			else low = mid + 1;
		}

		return low;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] row1 = new int[n];
		int[] row2 = new int[n];
		int heaviest;
		int i;

		row1[0] = sc.nextInt();
		heaviest = row1[0];
		for(i = 1; i < n; i++){
			row1[i] = sc.nextInt();
			if(row1[i] > heaviest)
				heaviest = row1[i];
		}

		for(i = 0; i < n; i++){
			row2[i] = sc.nextInt();
			if(row2[i] > heaviest)
				heaviest = row2[i];
		}

		System.out.println(binarySearch(0, heaviest, row1, row2));
	}

}