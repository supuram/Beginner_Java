/* We have a linked list and two integers M and N.Traverse the linked list such that you retain
M nodes then delete next N nodes,continue the same till end of the linked list.
Sample Input 1: M=3 N=2    LL: 1->2->3->4->5->6->7->8
Sample Output 1: 1->2->3->6->7->8   */

package Linked_List;
public class deletion_after_traversal
{
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void deletion(int m,int n)
    {
        Node temp=head,a;
        int i=1;
        while(i!=m)
        {
            temp=temp.next;
            i++;
        }
        i=0;
        a=temp.next;
        while(i!=n)
        {
            a=a.next;
            i++;
        }
        temp.next=a;
    }
    public void print()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args)
    {
        deletion_after_traversal list=new deletion_after_traversal();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(7);
        list.addFirst(8);
        list.addFirst(9);
        list.print();
        System.out.println();
        list.deletion(3,2);
        list.print();
    }
}
