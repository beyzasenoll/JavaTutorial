import java.io.*;
import java.util.*;


public class Main {
    public static void main(String args[]) {
        BFS graph1 = new BFS(6);

        graph1.addEdge(0, 1);
        graph1.addEdge(0, 3);
        graph1.addEdge(0, 4);
        graph1.addEdge(4, 5);
        graph1.addEdge(3, 5);
        graph1.addEdge(1, 2);
        graph1.addEdge(1, 0);
        graph1.addEdge(2, 1);
        graph1.addEdge(4, 1);
        graph1.addEdge(3, 1);
        graph1.addEdge(5, 4);
        graph1.addEdge(5, 3);

        System.out.println("Following is Breadth First Traversal:");
        graph1.BFS(0);

        System.out.println("--------------------------------------------------------------------------------------");
        DFS graph = new DFS(6);
        ;
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);
        graph.addEdge(4, 5);
        graph.addEdge(3, 5);
        graph.addEdge(1, 2);
        graph.addEdge(1, 0);
        graph.addEdge(2, 1);
        graph.addEdge(4, 1);
        graph.addEdge(3, 1);
        graph.addEdge(5, 4);
        graph.addEdge(5, 3);

        System.out.println("Following is Depth First Traversal");

        graph.DFS(0);
    }
}