import java.util.Scanner;

public class NewAlphabet{
	public static void main(String[] args){
		String[] alphabet = new String[26];

		alphabet[0] = "@";
		alphabet[1] = "8";
		alphabet[2] = "(";
		alphabet[3] = "|)";
		alphabet[4] = "3";
		alphabet[5] = "#";
		alphabet[6] = "6"; 
		alphabet[7] = "[-]"; 
		alphabet[8] = "|"; 
		alphabet[9] = "_|"; 
		alphabet[10] = "|<"; 
		alphabet[11] = "1"; 
		alphabet[12] = "[]\\/[]"; 
		alphabet[13] = "[]\\[]"; 
		alphabet[14] = "0"; 
		alphabet[15] = "|D"; 
		alphabet[16] = "(,)"; 
		alphabet[17] = "|Z"; 
		alphabet[18] = "$"; 
		alphabet[19] = "\'][\'"; 
		alphabet[20] = "|_|"; 
		alphabet[21] = "\\/"; 
		alphabet[22] = "\\/\\/"; 
		alphabet[23] = "}{"; 
		alphabet[24] = "`/"; 
		alphabet[25] = "2"; 

		String input;
		String result = "";

		Scanner sc = new Scanner(System.in);

		int i;

		input = sc.nextLine();
		char temp;

		for(i = 0; i < input.length(); i++){
			temp = input.toLowerCase().charAt(i);
			if(temp >= 'a' && temp <= 'z')
				result += alphabet[temp - 'a'];
			else result += temp;
		}

		System.out.println(result);

	}
}