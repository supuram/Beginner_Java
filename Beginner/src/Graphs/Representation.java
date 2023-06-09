package Graphs;
import java.util.*;
public class Representation
{
    int src;
    int dest;
    int wt;
    public Representation(int s, int d, int w)
    {
        this.src = s;
        this.dest = d;
        this.wt = w;
    }
    public static void main(String[] args)
    {
        /*
                        (5)     (1)      (2)
                     0 ----- 1 ----- 2 ------ 4
                             |       /
                          (3)|     / (1)
                             |   /
                             | /
                             3
         */
        int v = 5;
        ArrayList<Representation>[] graph = new ArrayList[v];
        /*
        null means undefined.
        The new keyword is used to create an object of a class, but in this case, it is being used to create an
        array of ArrayLists, not individual ArrayList objects. The expression new ArrayList[v] creates an array of
        ArrayLists with a length of v, where each element of the array is initialized to null. This means that no
        ArrayLists have been created yet.
        To create an individual ArrayList, you need to call the ArrayList constructor using the new keyword, like
        this: new ArrayList<>(). This creates a new, empty ArrayList object.
        */
        // initializing the array to empty
        for(int i = 0; i < v; i++)
        {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Representation(0, 1, 5));
        graph[1].add(new Representation(1, 0, 5));
        graph[1].add(new Representation(1, 2, 1));
        graph[1].add(new Representation(1, 3, 3));
        graph[2].add(new Representation(2, 1, 1));
        graph[2].add(new Representation(2, 3, 1));
        graph[2].add(new Representation(2, 4, 4));
        graph[3].add(new Representation(3, 1, 3));
        graph[3].add(new Representation(3, 2, 1));
        graph[4].add(new Representation(4, 2, 2));

        // 2's neighbours
        for(int i = 0; i < graph[2].size(); i++)
        {
            Representation r = graph[2].get(i);
            System.out.print(r.dest+" ");
        }
    }
}
