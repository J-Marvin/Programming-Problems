import java.util.*;

public class Akcija{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Long items[] = new Long[n];
		int i;
		long price = 0; 

		for(i = 0; i < n; i++)
			items[i] = sc.nextLong();

		Arrays.sort(items, Collections.reverseOrder());

		for(i = 0; i < items.length; i++)
			if(i % 3 == 0 || i % 3 == 1)
				price += items[i];
		
		System.out.println(price);

	}
} 