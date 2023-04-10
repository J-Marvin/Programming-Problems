import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Thought4 {

    static class Node{
        int num;
        String equation = "";

        public Node(int num, String equation) {
            this.num = num;
            this.equation = equation;
        }

        public Node(int num) {
            new Node(num, "");
        }

        public Node[] spawnChildren() {
            Node[] children = new Node[4];
            children[0] = new Node(num + 4, equation + "+ 4 ");
            children[1] = new Node(num - 4, equation + "- 4 ");
            children[2] = new Node(num * 4, equation + "* 4 ");
            children[3] = new Node(num / 4, equation + "/ 4 ");

            return children;
        }

        public void solve() {
            Stack<String> nums = new Stack<>();
            String[] tokens = equation.split(" ");

            for(int i =0; i < tokens.length; i++) {
                
            }

        }

        @Override
        public String toString() {
            return equation + "= " + num;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return num == node.num;
        }

    }
    public static void main(String[] args) throws Exception {

        ArrayList<Node> nodes = new ArrayList<>();
        nodes.add(new Node(4, "4 "));
        HashMap<Integer, Node> values = new HashMap<>();

        for(int i = 0; i < 3; i++) {
            int curNodes = nodes.size();
            for(int j = 0; j < curNodes; j++) {
                Node n = nodes.remove(0);
                nodes.addAll(Arrays.asList(n.spawnChildren()));
            }
        }

        for(int i = 0; i < nodes.size(); i++) {
            Node curNode = nodes.get(i);
            if (!values.containsKey(curNode.num)) {
                values.put(curNode.num, curNode);
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cases = Integer.parseInt(br.readLine());

        for (int i = 0; i < cases; i++) {
            int num = Integer.parseInt(br.readLine());

            if (values.containsKey(num)) {
                System.out.println(values.get(num).toString());
            } else {
                System.out.println("no solution");
            }
        }
    }
}
