package Stack_and_Queue.Stack;
import java.util.ArrayList;
public class stack_witharraylist
{
        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isEmpty()
        {
            return list.size()==0;
        }
        public static void push(int data)
        {
            list.add(data);
        }
        public static int pop()
        {
            if(isEmpty())
            {
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek()
        {
            if(isEmpty())
            {
                return -1;
            }
            return list.get(list.size()-1);
        }
    public static void main(String[] args)
    {
        /* If you try to access static methods with objects of the class as in, stack_witharraylist s=
        new stack_witharraylist(); then when the compiler sees that you try to access a static variable
        it assumes that you might have made a mistake (i.e. that your intention was to access an instance
        variable), so it warns about it.
        */
        stack_witharraylist.push(1);
        stack_witharraylist.push(2);
        stack_witharraylist.push(3);
        stack_witharraylist.push(4);
        while(!stack_witharraylist.isEmpty())
        {
            System.out.println(stack_witharraylist.peek());
            System.out.println(stack_witharraylist.pop());
        }
    }
}
