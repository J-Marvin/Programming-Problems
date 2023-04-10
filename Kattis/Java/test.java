import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
        
    static class Node{
        LinkedList<Node> linked = new LinkedList<Node>();
        int data;
        
        private Node(int n){
            data = n;
        }
        
        private void addNode(Node n){
            linked.add(n);
        }
    }
    
    
    // Complete the bfs function below.
    static int[] bfs(int n, int m, Node[] nodes, int s) {
        
        
        int distances[] = new int[n];
        int currentNode;
        int i;
        int x;
        Queue<Integer> queue = new LinkedList<Integer>(); 
        boolean visited[] = new boolean[n];
        LinkedList<Node> linkedNodes;
        s--;
        
        queue.offer(s);
        Arrays.fill(distances, -1);
        
        while(!queue.isEmpty()){
            currentNode = queue.remove();
            linkedNodes = nodes[currentNode].linked;
            
            for(i = 0; i < linkedNodes.size(); i++){
                x = linkedNodes.get(i).data;
                if(!visited[x]){
                    visited[x] = true;
                    if(distances[currentNode] == -1)
                        distances[x] = 6;
                    else
                        distances[x] = distances[currentNode] + 6;
                    
                    queue.add(linkedNodes.get(i).data);
                }
            }
        }
        
        
        return distances;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(System.out);

        Node[] nodes;
        Node node_1, node_2;
        int edge_1;
        int edge_2;

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] nm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nm[0]);

            int m = Integer.parseInt(nm[1]);

            int[][] edges = new int[m][2];

            Node[] nodes = new Node[n];

            for (int i = 0; i < m; i++) {
                edge_1 = scanner.nextInt() - 1;
                edge_2 = scanner.nextInt() - 1;

                node_1 = nodes[edge_1];
            
                if(node_1 == null){
                    node_1 = new Node(edge_1);
                    nodes[edge_1] = node_1;
                }
                
                node_2 = nodes[edge_2];
                
                if(node_2 == null){
                    node_2 = new Node(edge_2);
                    nodes[edge_2] = node_2;
                }
            }

            int s = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] result = bfs(n, m, nodes, s);

            for (int i = 0; i < result.length; i++) {
                if( i != s - 1){
                    bufferedWriter.write(String.valueOf(result[i]));

                    if (i != result.length - 1) {
                        bufferedWriter.write(" ");
                    }
                }
                    
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
