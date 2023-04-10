import java.util.Scanner;

public class LuhnCheckSum{
	
	public static void main(String[] args){
		int num;
		int i;
		String strNumber;
		boolean result[] = new boolean[100];
		Scanner sc = new Scanner(System.in);

		num = Integer.parseInt(sc.nextLine());

		for(i = 0; i < num; i++){
			strNumber = sc.nextLine();
			result[i] = checkSum(strNumber);
		}

		for(i = 0; i < num; i++)
	        if(result[i])
	            System.out.println("PASS");
	        else System.out.println("FAIL");

	     sc.close();
	     result = null;
	}

	public static boolean checkSum(String number){
		int j = 1;
	    int i;
	    int digit;
	    int sum = 0;

	    for(i = number.length() - 1; i >= 0; i --){
	        
	        if(j % 2 == 0){
	            digit = number.charAt(i) - '0';
	            digit *= 2;
	            
	            if(digit > 9)
	                digit = digit / 10 + digit % 10;
	        }  
	        else digit = number.charAt(i) - '0';
	        
	        j ++;
	       
	        sum += digit;
	    }

	    return (sum % 10 == 0);
	}
	
}