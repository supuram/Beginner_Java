package Stack_and_Queue;
import java.util.*;
public class queue_with_collection_framework
{
    public static void main(String[] args)
    {
        Queue<Integer> q=new LinkedList<>();  /*Queue is an interface which is implemented by two classes-
        Array and LinkedList. So we write new LinkedList<>() instead of new Queue() */
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
        Queue<Integer> q1=new ArrayDeque<>();  //for circular queue
        q1.add(6);
        q1.add(7);
        q1.add(8);
        q1.add(9);
        q1.add(10);
        while(!q1.isEmpty())
        {
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}
