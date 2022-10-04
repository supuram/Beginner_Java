import java.util.*;
public class chk
{
    public static void main(String[] args)
    {
        Stack<Integer> s=new Stack<>();
        int[] arr={21,44,35,77};
        for(int i=0;i<4;i++)
        {
            System.out.print(arr[s.peek()]);
            s.pop();
        }
    }
}
