package Stack_and_Queue.Stack;
import java.util.Stack;
public class push_at_bottom
{
    public static void main(String[] args)
    {
        Stack<Integer> s=new Stack<>();
        Stack<Integer> s1=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.print(s);
        System.out.println();
        while(!s.isEmpty())
        {
            int a=s.pop();
            s1.push(a);
        }
        s.push(5);
        while(!s1.isEmpty())
        {
            int a=s1.pop();
            s.push(a);
        }
        System.out.print(s);
    }
}
