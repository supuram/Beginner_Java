package Linked_List;
public class linkedlist_1
{
    Node head;
    private int size;
    linkedlist_1()
    {
        this.size=0;
    }
    class Node
    {
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void addFirst(String data)
    {
        Node newNode=new Node(data);
        //System.out.print(head.data+" ");
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node currNode=head;
        //System.out.println(head.data+" "+currNode.data+","+newNode.data);
        while(currNode.next!=null)
        {
            //System.out.println(head.data+" "+currNode.data+":"+newNode.data);
            currNode=currNode.next;
        }
        currNode.next=newNode;
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
    public void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
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
        secondLast.next=null;
    }
    public int getSize()
    {
        return size;
    }

    public static void main(String[] args)
    {
        linkedlist_1 list =new linkedlist_1();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("list");
        list.addLast("good");
        list.addLast("boy");
        list.addLast("is");
        list.addLast("he");
        list.printList();
        list.addFirst("this");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
    }
}
