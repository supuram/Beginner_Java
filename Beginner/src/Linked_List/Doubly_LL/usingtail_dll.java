package Linked_List.Doubly_LL;
public class usingtail_dll
{
    static Node head, tail;
    static int size;
    public static class Node
    {
        int data;
        Node next,prev;
        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void addLast(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        newNode.prev=currNode;
        currNode.next=newNode;
        tail=newNode;
    }
    public void addinthemiddle(int n,int data)
    {
        Node newNode=new Node(data);
        Node prevNode=head;
        int i=1;
        while(i!=n)
        {
            prevNode=prevNode.next;
            i++;
        }
        Node currNode=prevNode.next.next;
        prevNode.next=newNode;
        newNode.prev=prevNode;
        newNode.next=currNode;
        currNode.prev=newNode;
        size++;
    }
    public void printfromhead()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public void printfromtail()
    {
        Node temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
    }
    public static void main(String[] args)
    {
        usingtail_dll list=new usingtail_dll();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.addLast(11);
        System.out.print("Linked List from head = ");
        list.printfromhead();
        list.addinthemiddle(2,23);  //after 2nd position add 23
        System.out.println();
        System.out.print("Linked List from head = ");
        list.printfromhead();
        System.out.println();
        System.out.print("Linked List from tail = ");
        list.printfromtail();
        System.out.println();
        System.out.println("Size of the linked list = "+size);
    }
}
