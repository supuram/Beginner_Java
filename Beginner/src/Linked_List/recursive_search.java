package Linked_List;
public class recursive_search
{
    static Node head;
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
    public int search(int srh,int i,Node head)
    {   //this is not giving proper results
        if(head==null)
            return -1;
        if(head.data==srh)
        {
            return i;
        }
        System.out.print(head.data+" ");
        head=head.next;
        search(head.data,i+1,head);
        return i;
    }
    public static void main(String[] args)
    {
        recursive_search list =new recursive_search();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.printList();
        System.out.println(list.search(2,1,head));  //search 4
        list.printList();
    }
}
