package Tree.Binary_Search_Tree;
public class BST_Print_in_range
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
    public static void print(Node root, int k1, int k2)
    {
        if(root == null)
        {
            return;
        }
        if(root.data >= k1 && root.data <= k2)
        {
            print(root.left,k1,k2);
            System.out.print(root.data+" ");
            print(root.right,k1,k2);
        }
        else if(root.data < k1)
        {
            print(root.left,k1,k2);
        }
        else
        {
            print(root.right,k1,k2);
        }
    }
    public static void main(String[] args)
    {
        /*
                                        8                                              8
                                      /   \                                          /   \
                                     5     10            del(5)                     6     10
                                    / \      \        ----------->                 /        \
                                   3   6      11                                  3          11
                                  /             \                                /             \
                                 1               14                             1               14
        Print between k1=5 and k2=12. It will print - 5,6,8,10,11
         */

        int[] values = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        int i=0;
        for(;i<values.length;i++)
        {
            root = insert(root, values[i]);
        }
        print(root,5,12);
    }
}
