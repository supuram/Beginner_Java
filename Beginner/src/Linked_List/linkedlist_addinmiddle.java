package Linked_List;
public class linkedlist_addinmiddle
{
    Node head;
    static class Node
    {
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
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
    public void addinthemiddle(int n,String data)
    {
        Node newNode=new Node(data);
        Node prev=head;
        Node currNode;
        int i=1;
        while(i!=n)
        {
            prev=prev.next;
            i++;
        }
        currNode=prev.next.next;
        prev.next=newNode;
        newNode.next=currNode;
    }
    public static void main(String[] args)
    {
        linkedlist_addinmiddle  list =new linkedlist_addinmiddle();
        list.addFirst("boy");
        list.addFirst("good");
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("he");
        list.printList();
        list.addinthemiddle(2,"who");  //after 2nd position you have to add
        list.printList();
    }
}
