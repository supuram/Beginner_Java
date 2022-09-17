package Stack_and_Queue.Stack;
import java.util.Stack;
public class reverse_string
{

    public static void main(String[] args)
    {
        Stack<Character> s=new Stack<>();
        String str="school";
        int len=str.length();
        for(int i=0;i<len;i++)
        {
            s.push(str.charAt(i));
        }
        System.out.print(s);
        System.out.println();
        StringBuilder res=new StringBuilder();
        while(!s.isEmpty())
        {
            char ch=s.pop();
            res.append(ch);
            System.out.print(ch+" ");
        }
        System.out.println();
        System.out.println(res);
    }
}
