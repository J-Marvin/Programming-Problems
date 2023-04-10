import java.util.Scanner;

public class ACM{

	static class Problem{
		int time;
		int attempts;
		char name;
		String status;

		public Problem(int time, char name, String status){
			if(status.equals("right"))
				this.time = time;
			else this.time = 0;
			this.name = name;
			this.status = status;
			attempts = 1;
		}

		public void setCorrect(){
			this.status = "right";
		}

		public void addAttempt(){
			this.attempts ++;
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String[] input;
		Problem[] problems = new Problem[26];
		Problem temp;
		int time;
		char problem;
		String status;
		int solved;
		int totalTime;
		int i;

		do{
			input = sc.nextLine().split(" ");

			if(!input[0].equals("-1")){
				time = Integer.parseInt(input[0]);
				problem = input[1].charAt(0);
				status = input[2];

				temp = problems[problem - 'A'];

				if(temp == null)
					problems[problem - 'A'] = new Problem (time, problem, status);
				else{
					temp.attempts ++;
					temp.time = time;
					if(status.equals("right"))
						temp.status = "right";
				}
			}
		} while(!input[0].equals("-1"));

		solved = 0;
		totalTime = 0;
		
		for(i = 0; i < 26; i++){
			temp = problems[i];
			if(temp != null)
				if(temp.status.equals("right")){
					solved++;
					totalTime += temp.time + (temp.attempts - 1) * 20;
				}
		}

		System.out.print(solved + " " + totalTime);
	}
}