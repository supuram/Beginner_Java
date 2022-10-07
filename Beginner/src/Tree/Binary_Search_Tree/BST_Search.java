package Tree.Binary_Search_Tree;
public class BST_Search
{
    static class Node
    {
        int data;
        Node left, right;
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node insert(Node root, int val)
    {
        if(root == null)
        {
            root = new Node(val);
            return root;
        }
        if(root.data > val)
        {
            root.left = insert(root.left, val);
        }
        else
        {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static boolean search(Node root, int srh)
    {
        if(root == null)
        {
            return false;
        }
        if(root.data == srh)
        {
            return true;
        }
        if(root.data > srh)
        {
            System.out.print(root.data+" ");
            return search(root.left, srh);
        }
        else
        {
            System.out.print(root.data+" ");
            return search(root.right, srh);
        }
    }
    public static void main(String[] args)
    {
        /*
                                        5
                                       / \
                                      1   7
                                       \
                                        3
                                       / \
                                      2   4
         */
        int[] values = {5,1,3,4,2,7};
        Node root = null;
        int i=0;
        for(;i<values.length;i++)
        {
            root = insert(root, values[i]);
        }
        System.out.print(search(root, 4));
    }
}
