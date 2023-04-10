import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class DigitalDisplay{
	
	static String[][] numbers;

	public static void initDigits(){
		numbers[0][0] = "+---+";
		numbers[0][1] = "|   |";
		numbers[0][2] = "|   |";
		numbers[0][3] = "+   +";
		numbers[0][4] = "|   |";
		numbers[0][5] = "|   |";
		numbers[0][6] = "+---+";

		numbers[1][0] = "    +";
		numbers[1][1] = "    |";
		numbers[1][2] = "    |";
		numbers[1][3] = "    +";
		numbers[1][4] = "    |";
		numbers[1][5] = "    |";
		numbers[1][6] = "    +";

		numbers[2][0] = "+---+";
		numbers[2][1] = "    |";
		numbers[2][2] = "    |";
		numbers[2][3] = "+---+";
		numbers[2][4] = "|    ";
		numbers[2][5] = "|    ";
		numbers[2][6] = "+---+";

		numbers[3][0] = "+---+";
		numbers[3][1] = "    |";
		numbers[3][2] = "    |";
		numbers[3][3] = "+---+";
		numbers[3][4] = "    |";
		numbers[3][5] = "    |";
		numbers[3][6] = "+---+";

		numbers[4][0] = "+   +";
		numbers[4][1] = "|   |";
		numbers[4][2] = "|   |";
		numbers[4][3] = "+---+";
		numbers[4][4] = "    |";
		numbers[4][5] = "    |";
		numbers[4][6] = "    +";

		numbers[5][0] = "+---+";
		numbers[5][1] = "|    ";
		numbers[5][2] = "|    ";
		numbers[5][3] = "+---+";
		numbers[5][4] = "    |";
		numbers[5][5] = "    |";
		numbers[5][6] = "+---+";

		numbers[6][0] = "+---+";
		numbers[6][1] = "|    ";
		numbers[6][2] = "|    ";
		numbers[6][3] = "+---+";
		numbers[6][4] = "|   |";
		numbers[6][5] = "|   |";
		numbers[6][6] = "+---+";

		numbers[7][0] = "+---+";
		numbers[7][1] = "    |";
		numbers[7][2] = "    |";
		numbers[7][3] = "    +";
		numbers[7][4] = "    |";
		numbers[7][5] = "    |";
		numbers[7][6] = "    +";

		numbers[8][0] = "+---+";
		numbers[8][1] = "|   |";
		numbers[8][2] = "|   |";
		numbers[8][3] = "+---+";
		numbers[8][4] = "|   |";
		numbers[8][5] = "|   |";
		numbers[8][6] = "+---+";

		numbers[9][0] = "+---+";
		numbers[9][1] = "|   |";
		numbers[9][2] = "|   |";
		numbers[9][3] = "+---+";
		numbers[9][4] = "    |";
		numbers[9][5] = "    |";
		numbers[9][6] = "+---+";

		numbers[10][0] = " ";
		numbers[10][1] = " ";
		numbers[10][2] = "o";
		numbers[10][3] = " ";
		numbers[10][4] = "o";
		numbers[10][5] = " ";
		numbers[10][6] = " ";
	}

	public static void showTime(String input){
		int i;
		int n;
		int j;
		String[] time = new String[7];
		int num;

		Arrays.fill(time, "");

		for(i = 0; i < input.length(); i++){
			if(i != 2)
				num = input.charAt(i) - '0';
			else num = 10;

			for(j = 0; j < 7; j++){
				if(time[j].equals(""))
					time[j] = numbers[num][j] + " ";
				else time[j] = time[j] + " " + numbers[num][j] + " ";
			}
		}

		for(i = 0; i < 7; i++)
			System.out.println(time[i]);

		System.out.println("\n");
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		numbers = new String[11][7];
		initDigits();
		String input;
		char digit;
		ArrayList<String> times = new ArrayList<String>();
		int i;

		do{
			input = sc.nextLine();
			if(!input.equals("end"))
				times.add(input);
		} while(!input.equals("end"));

		for(i = 0; i < times.size(); i++)
			showTime(times.get(i));

		System.out.println("end");
	}
}