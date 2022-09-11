package Linked_List;
import java.util.LinkedList;
import java.util.Scanner;
public class linkedlist_addin_reverse
{
    public static void main(String[] args)
    {
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();
        LinkedList<Integer> l=new LinkedList<>();
        int i;
        Scanner sc=new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            System.out.print("Enter a number = ");
            int n1=sc.nextInt();
            l1.addLast(n1);
            System.out.println();
        }
        System.out.println("The first linked list = "+l1);
        for(i=0;i<3;i++)
        {
            System.out.print("Enter a number = ");
            int n1=sc.nextInt();
            l2.addLast(n1);
            System.out.println();
        }
        System.out.println("The second linked list = "+l2);
        int sum1=0,sum2=0,sum;
        for(i=0;i<3;i++)
        {
            sum1=sum1+l1.get(i)*(int)Math.pow(10,i);
        }
        for(i=0;i<3;i++)
        {
            sum2=sum2+l2.get(i)*(int)Math.pow(10,i);
        }
        sum=sum1+sum2;
        System.out.println(sum);
        for(i=0;i<3;i++)
        {
            int n=sum%10;
            System.out.println(n);
            sum=sum/10;
            l.addLast(n);
        }
        System.out.println(sum);
        System.out.println(l);
    }
}
