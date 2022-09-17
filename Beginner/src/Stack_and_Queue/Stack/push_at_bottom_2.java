package Stack_and_Queue.Stack;
import java.util.Stack;
public class push_at_bottom_2
{
    static void push_at_bottom(Stack<Integer> s, int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int a=s.pop();
        push_at_bottom(s,data);
        s.push(a);
    }
    public static void main(String[] args)
    {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.print(s);
        push_at_bottom(s,5);
        System.out.print(s);
    }
}
