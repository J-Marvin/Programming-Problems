import java.util.Scanner;
import java.lang.Math;

public class PizzaCrust{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		double area_with_crust = Math.PI * r * r;
		r -= c;
		double area_without_crust = Math.PI * r * r;

		double percentage = area_without_crust / area_with_crust * 100;

		System.out.println(percentage);

		sc.close();
	}
}