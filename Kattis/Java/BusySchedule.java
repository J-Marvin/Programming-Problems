import java.util.*;

public class BusySchedule{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		String[] schedule;
		int i;

		do{
			n = Integer.parseInt(sc.nextLine());
			schedule = new String[n];

			for(i = 0; i < n; i++)
				schedule[i] = sc.nextLine();

			Arrays.sort(schedule, new Comparator<String>() {
				public int compare(String s1, String s2){
					int s1_hour, s2_hour, s1_min, s2_min;
					if(s1.contains("p") && s2.contains("a"))
						return 1;
					else if(s2.contains("p") && s1.contains("a"))
						return -1;
					else{
						s1_hour = Integer.parseInt(s1.substring(0, s1.indexOf(":")));
						s1_min = Integer.parseInt(s1.substring(s1.indexOf(":") + 1, s1.indexOf(" ")));
						s2_hour = Integer.parseInt(s2.substring(0, s2.indexOf(":")));
						s2_min = Integer.parseInt(s2.substring(s2.indexOf(":") + 1, s2.indexOf(" ")));

						if(s1_hour == 12 && s2_hour != 12)
							return -1;
						else if(s2_hour == 12 && s1_hour != 12)
							return 1;
						else if(s1_hour == 12 && s2_hour == 12){
							if(s1_min < s2_min)
									return -1;
								else if(s1_min > s2_min)
									return 1;
								else return 0;
						}
						else{
							if(s1_hour < s2_hour)
								return -1;
							else if(s1_hour > s2_hour)
								return 1;
							else{
								if(s1_min < s2_min)
									return -1;
								else if(s1_min > s2_min)
									return 1;
								else return 0;
							}
						}
					}
				}
			});

			for(i = 0; i < n; i ++)
				System.out.println(schedule[i]);

			System.out.println();
		} while( n != 0 );
	}
} 