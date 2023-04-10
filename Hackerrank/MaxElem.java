import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MaxElem {

    public static class StackNode{
        public StackNode(long val, long max){
            this.max = max;
            this.val = val;
        }

        public long val;
        public long max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<StackNode> nums = new Stack<>();

        long max = Long.MIN_VALUE;
        for(int i = 0; i < n; i++){
            String line = br.readLine();
            if(line.contains(" ")){
                String[] parts = line.split(" ");
                long x = Long.parseLong(parts[1]);

                max = Math.max(x, max);
                nums.push(new StackNode(x, max));
            }
            else if(line.equals("2")){
                if(!nums.empty())
                    nums.pop();

                if(nums.empty())
                    max = Long.MIN_VALUE;
                else
                    max = nums.peek().max;
            } else{
                System.out.println(nums.peek().max);
            }
        }
    }
}
