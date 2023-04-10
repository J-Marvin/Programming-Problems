import java.util.Scanner;
import java.util.Arrays;

public class Slalom2{

	public static boolean canFinish(int speed, int[][] posts, int w, int wh){
		double currLeft;
		double currRight;
		double leftMost;
		double rightMost;
		boolean isRight;
		int i;
		double distance;

		currLeft = posts[0][0];
		currRight = leftMost + w; 

		for(i = 1; i < posts.length; i++){
			distance = posts[i][1] - posts[i - 1][1];

			if(leftMost > posts[i][0])
				isRight = false;
			else isRight = true;

			if(isRight){
				rightMost = currRight + wh * distance / speed;
				leftMost = currLeft + wh * distance / speed;

				if(rightMost < posts[i][0])
					return false;

				// if rightMost is in between two posts
				if(rightMost <= posts[i][0] + w && rightMost >= posts[i][0]){
					if(leftMost < posts[i][0])
						currLeft = post[i][0];

					currRight = rightMost;
				} else if(leftMost <= posts[i][0] + w && leftMost >= posts[i][0]){
					if(rightMost > posts[i][0] + w)
						currRight = post[i][0] + w;

					currLeft = leftMost;
				}

			} else{
				rightMost = currRight - wh * distance / speed;
				leftMost = currLeft - wh * distance / speed;

				if(leftMost > posts[i][0] + w)
					return false;

				if(rightMost <= posts[i][0] + w && rightMost >= posts[i][0]){
					if(leftMost < posts[i][0])
						currLeft = post[i][0];

					currRight = rightMost;
				} else if(leftMost <= posts[i][0] + w && leftMost >= posts[i][0]){
					if(rightMost > posts[i][0] + w)
						currRight = post[i][0] + w;

					currLeft = leftMost;
				}
			}
		}

		return true;

	} 

	public static int binarySearch(int[] skis, int[][] posts, int w, int wh){

		int low = 0;
		int high = skis.length;
		int mid;
		boolean canFinish = false;

		while(low <= high){
			mid = low + (high - low) / 2;
			if(getTime(skis[mid], posts, w, wh) != -1){
				canFinish = true;
				low = mid;
			}
			else high = mid;
		}

		if(canFinish)
			return low;
		else 
			return -1;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int w = sc.nextInt(); //distance of left and right gates
		int wh = sc.nextInt(); // max horizontal distance
		int n = sc.nextInt(); // number of pairs of posts

		int[][] posts = new int[n][2];
		int i;
		int x_pos;

		for(i = 0; i < n; i++){
			posts[i][0] = sc.nextInt(); // x
			posts[i][1] = sc.nextInt(); // y
		}
		int s = sc.nextInt(); //numbers of skis
		int[] skis = new int[s]; 

		for(i = 0; i < s; i++)
			skis[i] = sc.nextInt();
	}

}