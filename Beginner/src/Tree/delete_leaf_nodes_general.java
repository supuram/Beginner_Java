package Tree;
public class delete_leaf_nodes_general
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
        if(root == null)
        {
            return null;
        }
        root.left = delete(root.left, n);
        root.right = delete(root.right, n);
        if(root.left == null && root.right == null && root.data == n)
        {
            return null;
        }
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