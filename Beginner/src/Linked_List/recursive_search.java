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
    public int helper(Node head, int key)
    {
        if(head == null)
            return -1;
        if(head.data == key)
            return 0;
        int idx = helper(head.next, key);
        if(idx == -1)
            return -1;
        return idx+1;
    }

    public int recSearch(int key)
    {
        return helper(head,key);
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
        System.out.println(list.recSearch(2));
        list.printList();
    }
}
