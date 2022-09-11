package Linked_List;
import java.util.*;
public class linkedlist_swapinpairs
{
    /*public static void swap(LinkedList list)
    {
        int i=0;
        Integer temp;
        while(list(i)!=null && list(i+1)!=null)
        {
            temp=list.get(i);
            list.get(i)=list.get(i+1);
            list.get(i+1)=temp;
            i=i+2;
        }
        System.out.println(list);
    }*/
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number = ");
            int n = sc.nextInt();
            list.addFirst(n);
            System.out.println();
        }
        System.out.println(list);
        list.addLast(23);
        System.out.println(list);
        //swap(list);
    }
}
