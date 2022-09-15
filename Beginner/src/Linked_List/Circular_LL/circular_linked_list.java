//This code is for Singly Linked List which is also circular
package Linked_List.Circular_LL;
public class circular_linked_list
{
    static Node head,tail;
    static int size;
    public static class Node
    {
        Node next;
        int data;
        Node(int data)
        {
            this.data=data;
            this.next=null;
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
        head=newNode;
        tail.next=head;
    }
    public void addLast(int data)
    {
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
        tail.next=head;
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
        tail.next=head;
    }
    public void deleteLast()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        int i=1;
        Node temp=head;
        Node temp1=head.next;
        while(i!=size-1)
        {
            temp=temp.next;
            temp1=temp1.next;
            i++;
        }
        tail=temp;
        tail.next=head;
        size--;
    }
    public void printfromhead()
    {
        Node temp=head;
        int i=0;
        while(i!=size)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
            i++;
        }
    }
    public void printfromtail()
    {
        Node temp=tail;
        int i=0;
        while(i!=size)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
            i++;
        }
    }
    public static void main(String[] args)
    {
        circular_linked_list list=new circular_linked_list();
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
        System.out.print("Circular Linked List from head = ");
        list.printfromhead();
        System.out.println();
        System.out.print("Circular Linked List from tail = ");
        list.printfromtail();
        System.out.println();
        list.deleteFirst();
        list.deleteFirst();
        list.deleteFirst();
        System.out.print("Circular Linked List from head = ");
        list.printfromhead();
        System.out.println();
        System.out.print("Circular Linked List from tail = ");
        list.printfromtail();
        System.out.println();
        list.deleteLast();
        list.deleteLast();
        list.deleteLast();
        System.out.print("Circular Linked List from head = ");
        list.printfromhead();
        System.out.println();
        System.out.print("Circular Linked List from tail = ");
        list.printfromtail();
        System.out.println();
    }
}
