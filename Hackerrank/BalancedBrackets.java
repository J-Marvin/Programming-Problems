import java.io.*;
import java.util.Stack;

public class BalancedBrackets {
    // Complete the isBalanced function below.
    static String isBalanced(String s) {

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(stack.isEmpty())
                stack.push(c);
            else{
                switch(c){
                    case '}':
                        if(stack.peek() != '{')
                            return "NO";
                        else stack.pop();
                        break;
                    case ')':
                        if(stack.peek() != '(')
                            return "NO";
                        else stack.pop();
                        break;
                    case ']':
                        if(stack.peek() != '[')
                            return "NO";
                        else stack.pop();
                        break;
                    default:
                        stack.push(c);
                }
            }
        }

        if(stack.empty())
            return "YES";
        else return "NO";

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int tItr = 0; tItr < t; tItr++) {
            String s = br.readLine();

            String result = isBalanced(s);

            System.out.println(result);
        }

        br.close();
    }
}
