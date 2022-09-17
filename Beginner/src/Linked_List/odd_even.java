package Linked_List;
/*
We have a Linked List of integers,write a function to modify the linked list such that all even numbers
appear before all the odd numbers in the modified linked list.Also,keep the order of even and odd
numbers same.
Sample Input 1: 8->12->10->5->4->1->6->NULL
Sample Output 1: 8->12->10->4->6->5->1->NULL
 */
public class odd_even
{
    Node head;
    private int size=0;
    class Node
    {
        int data;
        Node next;
        Node()
        {

        }
        Node(int data)
        {
            this.data=data;
            this.next=null;
            size++;
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
    public void printList()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null)
        {
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public int getSize()
    {
        return size;
    }
    public void oddeven()
    {
        Node currNode=head;
        while(currNode!=null)
        {
            if(currNode.data % 2 == 0 && currNode.next.data % 2 ==1)
            {
                Node even_currNode=currNode;
                Node odd_currNode=currNode.next;
                currNode=currNode.next;
                while(currNode.data % 2 !=0)
                {
                    currNode=currNode.next;
                }
                even_currNode.next=currNode;
                even_currNode=even_currNode.next;
                currNode=currNode.next;
            }
        }
        /*int ct_e=0,ct_o=0;
        Node currNode=head;
        while(currNode.data % 2 != 0)
        {
            //System.out.print(currNode.data+" ");
            currNode=currNode.next;
        }
        while(even[ct_e]!=null)
        {
            System.out.print(even[ct_e].data+" ");
            ct_e++;
            currNode.next=even[ct_e];
            currNode=currNode.next;
        }
        while(even[ct_o]!=null)
        {
            System.out.print(odd[ct_o].data+" ");
            currNode.next=odd[ct_o];
            currNode=currNode.next;
            ct_o++;
        }*/
    }
    public static void main(String[] args)
    {
        odd_even list =new odd_even();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.printList();
        list.oddeven();
        list.printList();
        System.out.println(list.getSize());
    }
}
