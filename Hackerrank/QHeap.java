import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class QHeap {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i = 0; i < n; i++){
            String line = br.readLine().trim();
            if(line.contains(" ")){
                String[] parts = line.split(" ");
                int v = Integer.parseInt(parts[1]);

                if(parts[0].equals("1")){
                    q.add(v);
                } else{
                    q.remove(v);
                }
            } else{
                System.out.println(q.peek());
            }
        }
    }
}
