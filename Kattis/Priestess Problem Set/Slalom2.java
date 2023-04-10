import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Slalom2{
	static int w, n, s;
	static double wh;
	static int[][] posts;
	static int[] skis;

	public static boolean canFinish(int speed){
		double currLeft;
		double currRight;
		double leftMost;
		double rightMost;
		int i;
		double distance;
		double time;
		double leftGate;
		double rightGate;

		currLeft = posts[0][0];
		currRight = posts[0][0] + w; 

		for(i = 1; i < posts.length; i++){
			distance = posts[i][1] - posts[i - 1][1];
			time = distance / speed;

			leftGate = posts[i][0];
			rightGate = posts[i][0] + w;
			
			leftMost = currLeft - wh * time;
			rightMost = currRight + wh * time;

			currLeft = Math.max(leftMost, leftGate);
			currRight = Math.min(rightMost, rightGate);
			
			if(currLeft > currRight + 1e-9)
				return false;
		}

		return true;
	} 

	public static int binarySearch(){

		int low = 0;
		int high = skis.length - 1;
		int mid;
		boolean isImpossible = true;

		while(low <= high){
			mid = low + (high - low) / 2;
			if(canFinish(skis[mid])){
				isImpossible = false;
				low = mid + 1;
			}
			else high = mid - 1;
		}

		if(!isImpossible)
			return high;
		else 
			return -1;
	}

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input;

		input = reader.readLine().split(" ");
		w = Integer.parseInt(input[0]); //distance of left and right gates
		wh = Double.parseDouble(input[1]); // max horizontal distance
		n = Integer.parseInt(input[2]); // number of pairs of posts

		posts = new int[n][2];
		int i;

		for(i = 0; i < n; i++){
			input = reader.readLine().split(" ");
			posts[i][0] = Integer.parseInt(input[0]); // x
			posts[i][1] =Integer.parseInt(input[1]); // y
		}
		int s = Integer.parseInt(reader.readLine()); //numbers of skis
		skis = new int[s]; 

		for(i = 0; i < s; i++)
			skis[i] = Integer.parseInt(reader.readLine());

		Arrays.sort(skis);

		int index = binarySearch();

		if(index == -1)
			System.out.println("IMPOSSIBLE");
		else System.out.println(skis[index]);
	}

}