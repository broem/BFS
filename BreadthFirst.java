import java.util.LinkedList;
/**
 * Created by Benjammin on 1/2/2017.
 * Purpose of this is to implement a BFS for a graph of integers, edges have no weight
 */
public class BreadthFirst {
    private LinkedList<Integer> graph[]; // adjacency list
    private int vertices;
    private LinkedList<Integer> solution = new LinkedList<>(); // solution store

    public BreadthFirst(int size) {
        vertices = size;
        graph = new LinkedList[vertices];
        for(int i = 0; i< vertices; i++) {
            graph[i] = new LinkedList<>(); // creates the adjacency linkedlist
        }
    }

    public void addEdge(int from, int to) {
        graph[from].add(to);
    }

    public void search(int current) {
        boolean visited[] = new boolean[vertices];
        visited[current] = true; //this takes up more space, should create a node object to pass in
        solution.addLast(current);

        while (!solution.isEmpty()){
            int temp = solution.poll();
            System.out.print(temp + " ");

            for(int i=0; i<graph[temp].size();i++){
                if(!visited[graph[temp].get(i)]){
                    solution.addLast(graph[temp].get(i));
                    visited[graph[temp].get(i)] = true;
                }
            }
        }
    }


}
