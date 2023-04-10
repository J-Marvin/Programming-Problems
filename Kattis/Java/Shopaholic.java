import java.util.*;

public class Shopaholic{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long items[] = new long[n];
		int i;

		for(i = 0; i < n; i++)
			items[i] = sc.nextInt();

		Arrays.sort(items);
		long discount = 0;

		i = items.length - 1;
		while( i - 2 >= 0){
			discount += items[i - 2];
			i -= 3;
		}
		
		System.out.println(discount);

	}
} 