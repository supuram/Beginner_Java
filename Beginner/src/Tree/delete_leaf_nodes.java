package Tree;
public class delete_leaf_nodes
{
    static class Node
    {
        int data;
        Node left,right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node delete(Node root, int n)
    {
        // This code does not cover all test cases.
        if(root == null)
        {
            return root;
        }
        if(root.left == null || root.right == null)
        {
            return null;
        }
        if(root.left.left == null && root.left.right == null && root.left.data == n)
        {
            return root.left = null;
        }
        if(root.right.left == null && root.right.right == null && root.right.data == n)
        {
            return root.right = null;
        }
        delete(root.left, n);
        delete(root.right, n);
        return root;
    }
    public static void preorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args)
    {
        /*
        We have a binary tree and a target integer x, delete all the leaf nodes having value as x.

                                    1                             1
                                  /   \        x=3               /
                                 3     3     ------>            3
                                / \                              \
                               3   5                              5

         */
        Node root=new Node(1);
        root.left=new Node(3);
        root.right=new Node(3);
        root.left.left=new Node(3);
        root.left.right=new Node(5);
        root.right.left=new Node(2);
        root.right.right=new Node(3);
        root.left.left.left=new Node(3);
        root.left.left.right=new Node(6);
        preorder(root);
        System.out.println();
        System.out.println(delete(root, 3));
        preorder(root);
    }
}