package Stack_and_Queue.Stack;
import java.util.Stack;
/*
An input string is valid if - the open brackets are closed by the same type of brackets, open brackets
must be closed in the correct order, every close bracket has a corresponding open bracket of the same type
Valid - {}()[], (), ({[]})
Invalid - {), [}, (([)]), ][
 */
public class valid_parenthesis
{
    public static boolean valid(String str)
    {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')
                s.push(ch);
            else {
                if(s.isEmpty())
                    return false;
                else{
                    if((s.peek()=='(' && ch==')') || (s.peek()=='{' && ch=='}') ||
                            (s.peek()=='[' && ch==']'))
                    {
                        s.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
            }
        }
        return s.isEmpty();
    }
    public static void main(String[] args)
    {
        String str="[]{}())";
        System.out.print(valid(str));
    }
}
