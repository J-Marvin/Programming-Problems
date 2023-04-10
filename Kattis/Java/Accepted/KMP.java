import java.util.Scanner;
import java.lang.Math;

public class KMP{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String kmp = "";
		String name = sc.nextLine();


		while(name.contains("-")){
			kmp += name.charAt(0);
			name = name.substring(name.indexOf("-") + 1);
		}

		kmp += name.charAt(0);

		System.out.println(kmp);

		sc.close();
	}
}