import java.util.Scanner;
import java.util.Arrays;

public class Firefly{
	
	static int n;
	static int h;
	

	public static int upper_bound(int[] data, int key){
		int low = 0;
		int high = data.length;
		int mid;

		while (low < high){
			mid = low + (high - low) / 2;

			if(key >= data[mid])
				low = mid + 1;
			else high = mid;
		}

		return low;
	}

	public static int lower_bound(int[] data, int key){
		int low = 0;
		int high = data.length;
		int mid;

		while (low < high){
			mid = low + (high - low) / 2;

			if(key > data[mid])
				low = mid + 1;
			else high = mid;
		}

		return low;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); //length
		h = sc.nextInt(); //height

		int i;
		int min = n;
		int count = 0;
		int temp;
		int[] obs_up;
		int[] obs_down;

		obs_up = new int[n / 2];
		obs_down = new int[n / 2];

		for(i = 0; i < n; i++){
			if(i % 2 == 0)
				obs_down[i / 2] = sc.nextInt();
			else obs_up[i / 2] = sc.nextInt();
		}

		Arrays.sort(obs_down);
		Arrays.sort(obs_up);

		for(i = 0; i < h; i++){
			temp = obs_up.length - upper_bound(obs_down, i + 1);
			temp += obs_up.length - lower_bound(obs_up, h - i - 1);

			if(temp == min)
				count += 1;
			else if(temp < min){
				min = temp;
				count = 1;
			}
		}

		System.out.println(min + " " + count);

		sc.close();
	}
}