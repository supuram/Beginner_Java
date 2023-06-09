package Graphs;
import java.util.*;
public class BFS
{
    int src;
    int dest;
    int wt;
    public BFS(int s, int d, int w)
    {
        this.src = s;
        this.dest = d;
        this.wt = w;
    }
    static void createGraph(ArrayList<BFS>[] graph)
    {
        for(int i = 0; i < graph.length; i++)
        {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new BFS(0,1,1));
        graph[0].add(new BFS(0,2,1));

        graph[1].add(new BFS(1,0,1));
        graph[1].add(new BFS(1,3,1));

        graph[2].add(new BFS(2,0,1));
        graph[2].add(new BFS(2,4,1));

        graph[3].add(new BFS(3,1,1));
        graph[3].add(new BFS(3,5,1));
        graph[3].add(new BFS(3,4,1));

        graph[4].add(new BFS(4,2,1));
        graph[4].add(new BFS(4,3,1));
        graph[4].add(new BFS(4,5,1));

        graph[5].add(new BFS(5,3,1));
        graph[5].add(new BFS(5,4,1));
        graph[5].add(new BFS(5,6,1));

        graph[6].add(new BFS(6,5,1));
    }

    public static void bfs(ArrayList<BFS>[] graph)  // Time Complexity - O(v + E) , v = vertice, e = edge
    {
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[graph.length];
        q.add(0);  // source. In graph you can take any number as source

        while(!q.isEmpty())
        {
            int curr = q.remove();
            if(!vis[curr])  // if vis[curr] is false
            {
                System.out.print(curr+" ");
                vis[curr] = true;
                for(int i = 0; i < graph[curr].size(); i++)
                {
                    BFS b = graph[curr].get(i);
                    q.add(b.dest);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        /*
                         1 --- 3
                        /      |\
                       0       | 5 --- 6
                        \      | /
                         2 --- 4
         */
        int v = 7;
        ArrayList<BFS>[] graph = new ArrayList[v];
        createGraph(graph);
        bfs(graph);
    }
}
