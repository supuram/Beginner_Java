package Stack_and_Queue.Stack;
import java.util.Stack;
/* The next greater element of some element x in an array is the first greater element that is to the
right of x in the same array.
Input - [4,5,2,25]
Output  -  [5,25,25,-1]
 */
public class next_greater_element
{
    public static void main(String[] args)
    {
        int[] arr={4,5,2,25};
        int len=arr.length;
        Stack<Integer> s=new Stack<>();
        int[] grt=new int[len];
        System.out.print(arr[s.peek()]);
        for(int i=len-1;i>=0;i--)
        {
            while(!s.isEmpty())
            {
                s.peek();
            }
        }
    }
}
