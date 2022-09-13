package Linked_List.Doubly_LL;
public class add_inmiddle_dll
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
        add_inmiddle_dll list=new add_inmiddle_dll();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.addLast(11);
        list.print();
        list.addinthemiddle(2,23);  //after 2nd position add 23
        System.out.println();
        list.print();
        System.out.println();
        System.out.println("Size of the linked list = "+size);
    }
}
