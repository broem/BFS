/**
 * Created by Benjammin on 1/3/2017.
 */
public class Driver {
    public static void main(String[] args) {
        BreadthFirst bfs = new BreadthFirst(6);

        bfs.addEdge(0,1);
        bfs.addEdge(1,2);
        bfs.addEdge(1,0);
        bfs.addEdge(1,3);
        bfs.addEdge(1,4);
        bfs.addEdge(2,1);
        bfs.addEdge(2,5);
        bfs.addEdge(3,1);
        bfs.addEdge(3,4);
        bfs.addEdge(4,1);
        bfs.addEdge(4,3);
        bfs.addEdge(5,2);

        bfs.search(5);

    }
}
