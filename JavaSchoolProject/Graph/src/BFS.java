import java.util.*;

public class BFS {
    private int V;
    private LinkedList<Integer> adj[];
    private Queue<Integer> queue;

    public BFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; i++)
        {
            adj[i] = new LinkedList<>();
        }
        queue = new LinkedList<Integer>();
    }
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }

    void BFS(int n) {
        boolean nodes[] = new boolean[V];
        int a = 0;
        nodes[n] = true;
        queue.add(n);
        int count1 = 0;
        int count2 = 0;

        while (queue.size() != 0) {
            n = queue.poll();
            System.out.print(n + " ");
            for (int i = 0; i < adj[n].size(); i++)

            {
                count1++;
                a = adj[n].get(i);

                if (!nodes[a])
                {
                    nodes[a] = true;
                    queue.add(a);
                    count1++;
                }
            }
        }
        System.out.println("---->count 1=> " + count1 );
    }
}
