import java.util.Scanner;

public class MissingNumbers{

	public static int binarySearch(int[] data, int key){
		int lo = 0;
		int hi = data.length;
		int mid;

		while(lo < hi){
			mid = lo + (hi - lo) / 2;

			if(data[mid] == key)
				return mid;
			else if(key > data[mid])
				lo = mid + 1;
			else hi = mid;
		}

		return -1;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		int[] numbers = new int[n];

		for(i = 0; i < n; i++)
			numbers[i] = sc.nextInt();

		if(numbers[n - 1] == n)
			System.out.println("good job");
		else{
			for(i = 1; i <= numbers[n - 1]; i++)
				if(binarySearch(numbers, i) == -1)
					System.out.println(i);
		}
		sc.close();
	}
}