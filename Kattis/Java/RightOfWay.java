import java.util.Scanner;

public class RightOfWay{

	public static String getOpposite(String dir){
		if(dir.equals("North"))
			return "South";
		else if(dir.equals("South"))
			return "North";
		else if(dir.equals("East"))
			return "West";
		else return "East";
	}	

	public static String getRight(String dir){
		if(dir.equals("North"))
			return "West";
		else if(dir.equals("South"))
			return "East";
		else if(dir.equals("East"))
			return "North";
		else return "South";
	}

	public static String getLeft(String dir){
		if(dir.equals("North"))
			return "East";
		else if(dir.equals("South"))
			return "West";
		else if(dir.equals("East"))
			return "South";
		else return "North";
	}

	public static String giveRight(String from, String to, String other){
		if(to.equals(getOpposite(from)) && other.equals(getRight(from)))
			return "Yes";
		else if(to.equals(getLeft(from)) && (other.equals(getRight(from)) || other.equals(getOpposite(from))))
			return "Yes";
		else return "No";
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String input[] = sc.nextLine().split(" ");

		System.out.println(giveRight(input[0], input[1], input[2]));

		sc.close();
	}
} 