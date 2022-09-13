package Linked_List;
public class iterative_search
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
    public void search(int srh)
    {
        Node prev=head;
        int i=1;
        while(prev.data!=srh)
        {
            prev=prev.next;
            i++;
        }
        System.out.println(srh+" found at "+i+" th position");
    }
    public static void main(String[] args)
    {
        iterative_search list =new iterative_search();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.printList();
        list.search(4);  //search 4
        list.printList();
    }
}
