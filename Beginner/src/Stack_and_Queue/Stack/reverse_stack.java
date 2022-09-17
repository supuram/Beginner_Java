package Stack_and_Queue.Stack;
import java.util.Stack;
public class reverse_stack
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
    static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        int top=s.pop();
        reverse(s);
        push_at_bottom(s,top);
    }
    public static void main(String[] args)
    {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.print(s);
        reverse(s);
        System.out.println();
        System.out.print(s);
    }
}
