package Stack_and_Queue.Stack;
import java.util.Stack;
/*
Duplicate Parnthesis exists - (((a+b))+c) -> returns true
Duplicate Parnthesis does not exists- ((a+b)+(c+d)), ((a+b)+c) -> returns false
 */
public class duplicate_parenthesis
{
    public static boolean isDuplicate(String str)
    {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==')')
            {
                int ct=0;
                while(s.peek()!='(')
                {
                    s.pop();
                    ct++;
                }
                if(ct<1)
                {
                    return true;
                }
                else {
                    s.pop();
                }
            }
            else {
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        String str="(((a+b)+(c+d)))";
        System.out.print(isDuplicate(str));
    }
}
