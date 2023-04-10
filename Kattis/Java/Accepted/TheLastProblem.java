import java.util.Scanner;

public class TheLastProblem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		System.out.println("Thank you, " + name + ", and farewell!");
		sc.close();
	}
}