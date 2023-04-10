import java.util.Scanner;

public class PopularVote{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i, j, v, highestVotes, candidate, voteCount, currentVote, totalVotes;

		for(i = 0; i < n; i++){
			v = sc.nextInt();
			highestVotes = 0;
			candidate = 0;
			voteCount = 0; 
			totalVotes = 0;

			for(j = 0; j < v; j++){
				currentVote = sc.nextInt();
				if(currentVote > highestVotes){
					highestVotes = currentVote;
					voteCount = 1;
					candidate = j + 1;
				}
				else if(currentVote == highestVotes)
					voteCount++;

				totalVotes += currentVote;
			}

			if(highestVotes > totalVotes / 2)
				System.out.println("majority winner " + candidate);
			else if(voteCount == 1)
				System.out.println("minority winner " + candidate);
			else System.out.println("no winner");

		}
	}
} 