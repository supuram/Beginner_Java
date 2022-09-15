/* We have a linked list and two keys in it,swap nodes for two given keys. Reverse the nodes in between
swapped nodes
Sample Input 1: 9->8->7->6->5->4->3->2->1  ,  x=3, y=8
Sample Output 1: 9->8->2->3->4->5->6->7->1    */

package Linked_List;
public class swapping_and_reverse_nodes
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
    {
        Node temp=head,c=head;
        int i=1;
        while(i!=x-1)
        {
            temp=temp.next;
            i++;
        }
        i=1;
        while(i!=x)
        {
            c=c.next;
            i++;
        }
        Node prevNode=c;
        Node currNode=c.next;
        Node nextNode=currNode;
        i=0;
        while(i!=(y-x))
        {
            //System.out.print(currNode.data+" ");
            nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
            i++;
        }
        //System.out.print(prevNode.data+" "+nextNode.data+" "+c.data);
        temp.next=prevNode;
        c.next=nextNode;
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
        swapping_and_reverse_nodes list=new swapping_and_reverse_nodes();
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
        list.swap(3,8);
        System.out.println();
        list.print();
    }
}
