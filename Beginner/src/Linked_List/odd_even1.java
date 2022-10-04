package Linked_List;
import java.util.*;
public class odd_even1
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list=new LinkedList<>();
        LinkedList<Integer> list1=new LinkedList<>();
        LinkedList<Integer> list2=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            System.out.print("Enter an integer = ");
            int n=sc.nextInt();
            list.addLast(n);
            System.out.println();
        }
        System.out.println(list);
        for(int i=2;i>=0;i--)
        {
            int n=list.get(i);
            if(n%2==0)
            {
                list1.addFirst(n);
            }
            else
            {
                list2.addFirst(n);
            }
        }
        System.out.print(list1+" "+list2);
    }
}
