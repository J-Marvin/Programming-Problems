import java.util.Scanner;
import java.util.Arrays;

public class BookingARoom{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int n = sc.nextInt();
		int i;
		int roomNo;
		boolean isDone = false;

		boolean[] rooms = new boolean[r];
		Arrays.fill(rooms, false);

		for(i = 0; i < n; i++){
			roomNo = sc.nextInt();
			rooms[roomNo - 1] = true;
		} 

		if(n == r)
			System.out.println("too late");
		else{
			for(i = 0; i < rooms.length && !isDone; i++){
				if(!rooms[i]){
					isDone = true;
					System.out.println(i + 1);
				}
			}
		}
	}
}