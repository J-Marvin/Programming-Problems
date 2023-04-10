import java.util.*;

public class Simplicity{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();

		int i;
		boolean[] alphabet = new boolean[26];
		Arrays.fill(alphabet, false);
		int letter_count = 0;
		char letter;
		Integer[] alphabet_count = new Integer[26];
		int remove = 0;

		Arrays.fill(alphabet_count, 0);
		for(i = 0; i < word.length(); i ++){
			letter = word.charAt(i);

			if(!alphabet[letter - 'a']){
				letter_count++;
				alphabet[letter - 'a'] = true;
			}

			alphabet_count[letter - 'a']++;
		}

		Arrays.sort(alphabet_count, new Comparator<Integer>(){
			public int compare(Integer num1, Integer num2){
				if(num1 == 0 && num2 != 0)
					return 1;
				else if(num1 != 0 && num2 == 0)
					return -1;
				else if(num1 == 0 && num2 == 0)
					return 0;
				else{
					if(num1 > num2)
						return 1;
					else if(num1 < num2)
						return -1;
					else return 0;
				}
			}

		});

		i = 0;

		while(letter_count > 2){
			remove += alphabet_count[i];
			i++;
			letter_count--;
		}

		System.out.println(remove);

	}
} 