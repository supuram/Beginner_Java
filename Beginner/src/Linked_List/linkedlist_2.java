package Linked_List;
import java.util.*;
public class linkedlist_2
{
    public static void main(String[] args)
    {
        LinkedList<String> list=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            System.out.print("Enter a string = ");
            String s=sc.nextLine();
            list.addFirst(s);
            System.out.println();
        }
        System.out.println(list);
        list.addLast("kurkure");
        System.out.println(list);
        int size=list.size();
        System.out.println(size);
        for(int i=0;i<size;i++)
        {
            System.out.print(list.get(i)+"->");
        }
        System.out.println();
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
