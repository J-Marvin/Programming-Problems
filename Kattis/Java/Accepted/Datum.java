import java.util.*;
import java.time.*;

public class Datum{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		DayOfWeek day;
		int d = sc.nextInt();
		int m = sc.nextInt();

		day = LocalDate.of(2009, m, d).getDayOfWeek();

		switch(day.getValue()){
			case 1:  System.out.println("Monday");
					break;
			case 2:  System.out.println("Tuesday");
					break;
			case 3:  System.out.println("Wednesday");
					break;
			case 4:  System.out.println("Thursday");
					break;
			case 5:  System.out.println("Friday");
					break;
			case 6:  System.out.println("Saturday");
					break;
			case 7:  System.out.println("Sunday");
					break;
		}
		sc.close();
	}
} 