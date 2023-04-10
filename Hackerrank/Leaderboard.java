import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Leaderboard {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> scores = new ArrayList<>();
        String[] parts = br.readLine().split(" ");

        for(int i = 0; i < n; i++){
            int x = Integer.parseInt(parts[i]);
            if(scores.isEmpty())
                scores.add(x);
            else if(x != scores.get(scores.size() - 1))
                scores.add(x);
        }

        int m = Integer.parseInt(br.readLine());
        ArrayList<Integer> player = new ArrayList<>();
        parts = br.readLine().split(" ");

        for(int i = 0; i < m; i++){
            int x = Integer.parseInt(parts[i]);
            player.add(x);
        }

        int rank = scores.size();
        int playerInd = 0;

        while(playerInd < m){

            while(rank - 1 >= 0 && scores.get(rank - 1) <= player.get(playerInd))
                rank--;

            System.out.println(rank + 1);
            playerInd++;
        }

    }

}
