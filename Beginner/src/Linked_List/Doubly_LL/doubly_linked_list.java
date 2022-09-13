package Linked_List.Doubly_LL;
public class doubly_linked_list
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
    public void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
        head.prev=null;
    }
    public void deleteLast()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null)
        {
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        lastNode.prev=null;
        secondLast.next=null;
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
        doubly_linked_list list=new doubly_linked_list();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.addLast(9);
        list.addLast(10);
        list.addLast(11);
        list.print();
        list.deleteFirst();
        list.deleteFirst();
        list.deleteFirst();
        list.deleteFirst();
        System.out.println();
        list.print();
        list.deleteLast();
        list.deleteLast();
        System.out.println();
        list.print();
        System.out.println();
        System.out.println("Size of the linked list = "+size);
    }
}
