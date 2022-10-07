package Tree.Binary_Search_Tree;
public class BST_Basics
{
    /*
    Binary Search Tree (BST)
    Time complexity for search = O(H), where H = height of the tree.
    Left subtree nodes < roots
    Right subtree nodes > roots
    Left and Right subtree are also BST with no duplicates
    Inorder traversal of BST gives a sorted sequence
     */
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
        // System.out.print() are there to understand the code in dry run.
        System.out.print(val+"=");
        if(root == null)
        {
            root = new Node(val);
            System.out.print("("+root.data+")");
            return root;
        }
        if(root.data > val)
        {
            root.left = insert(root.left, val);
            System.out.print("{"+root.left.data+"}");
        }
        else
        {
            root.right = insert(root.right, val);
            System.out.print("["+root.right.data+"]");
        }
        System.out.print(root.data+",");
        return root;
    }
    public static void inorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
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
            System.out.print("|"+root.data+"|");
            System.out.println();
        }
        System.out.print(root.data+",");
        System.out.println();
        inorder(root);
    }
}
