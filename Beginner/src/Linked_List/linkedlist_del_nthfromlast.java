package Linked_List;
public class linkedlist_del_nthfromlast
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
    public void del_nth_from_last(int n)
    {
        n=5-n;
        Node prev=head;
        int i=1;
        while(i!=n)
        {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
    }
    public static void main(String[] args)
    {
        linkedlist_del_nthfromlast list =new linkedlist_del_nthfromlast ();
        list.addFirst("boy");
        list.addFirst("good");
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("he");
        list.printList();
        list.del_nth_from_last(2);  //delete from the 2nd position
        list.printList();
    }
}
