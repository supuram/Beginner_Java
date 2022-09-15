/* We have a linked list and two keys in it,swap nodes for two given keys.Nodes should be swapped
by changing links.Swapping data of nodes may be expensive in many situations when data contains
many fields. It may be assumed that all keys in the linked list are distinct.
Sample Input 1: 1->2->3->4,  x=2, y=4
Sample Output 1: 1->4->3->2    */

package Linked_List;
public class swapping_nodes
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
    public void swap(int x,int y)
    {//this is applicable only when x is not equal to 1
        if(x!=1) {
            Node temp = head, c = head, d = head.next, e = head;
            int i = 1;
            while (i != x - 1) {
                temp = temp.next;
                i++;
            }
            Node a = temp.next, b = temp.next.next;
            i = 1;
            while (i != y - 1) {
                e = e.next;
                i++;
            }
            i = 1;
            while (i != y) {
                c = c.next;
                d = d.next;
                i++;
            }
            temp.next = c;
            c.next = b;
            e.next = a;
            a.next = d;
        }
        else {
            Node temp = head, c = head, d = head.next, e = head;
            int i;
            Node a = temp.next;
            //System.out.print(a.data+" ");
            i = 1;
            while (i != y - 1) {
                e = e.next;
                i++;
            }
            //System.out.print(e.data+" ");
            i = 1;
            while (i != y) {
                c = c.next;
                d = d.next;
                i++;
            }
            /*System.out.print(c.data+" ");
            System.out.print(d.data+" ");*/
            c.next=a;
            e.next=temp;
            temp.next=d;
        }
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
        swapping_nodes list=new swapping_nodes();
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
        list.swap(1,5);
        System.out.println();
        list.print();
    }
}
