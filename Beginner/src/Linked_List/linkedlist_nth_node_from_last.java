package Linked_List;
import java.util.*;
public class linkedlist_nth_node_from_last
{
    public static void nthnode(LinkedList list,int k)
    {
        int size=list.size();
        int len=size-k;
        list.remove(len);
        System.out.println(list);
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
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
        int k;
        System.out.println("Enter the position from the last node you want to delete from linked list");
        k=sc.nextInt();
        nthnode(list,k);
    }
}
