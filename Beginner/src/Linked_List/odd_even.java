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
        //assuming head is even
        Node evenNode=head.next,currNode1=head;
        while(evenNode!=null)
        {
            //System.out.print(currNode1.data+"/");
            if(evenNode.data%2==0)
            {
                System.out.print(currNode1.data+",");
                currNode1.next=evenNode;
                currNode1=currNode1.next;
            }
            evenNode=evenNode.next;
        }
        again(currNode1);
        //currNode1.next=null;
        /*System.out.println();
        Node oddNode=head.next;
        while(oddNode!=null)
        {
            //System.out.print(currNode1.data+";");
            if(oddNode.data%2==1)
            {
                System.out.print(currNode1.data+":");
                currNode1.next=oddNode;
                currNode1=currNode1.next;
                System.out.print(currNode1.data+":");
            }
            oddNode=oddNode.next;
        }*/
    }
    public void again(Node currNode1)
    {
        Node oddNode=head;
        while(oddNode!=null)
        {
            //System.out.print(currNode1.data+"/");
            if(oddNode.data%2==1)
            {
                //System.out.print(currNode1.data+",");
                currNode1.next=oddNode;
                currNode1=currNode1.next;
            }
            oddNode=oddNode.next;
        }
    }
    public static void main(String[] args)
    {
        odd_even list =new odd_even();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);
        list.printList();
        list.oddeven();
        System.out.println();
        list.printList();
        System.out.println(list.getSize());
    }
}
