import java.util.*;


class DFS {
    int V;

    LinkedList<Integer>[] adj;

    DFS(int V) {
        this.V = V;
        adj = new LinkedList[V];

        for (int i = 0; i < adj.length; i++)
            adj[i] = new LinkedList<Integer>();

    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void DFS(int n) {
        boolean nodes[] = new boolean[V];
        int count1 = 0;
        int count2 = 0;

        Stack<Integer> stack = new Stack<>();

        stack.push(n);                                    //push root node to the stack
        int a = 0;

        while (!stack.empty()) {
            n = stack.peek();
            stack.pop();

            if (nodes[n] == false) {
                System.out.print(n + " ");
                nodes[n] = true;
            }

            for (int i = 0; i < adj[n].size(); i++)
            {
                count1++;
                a = adj[n].get(i);
                if (!nodes[a])
                {
                    stack.push(a);
                    count1++;
                }
            }

        }
        System.out.println("---->count 1= " + count1 );
    }


}