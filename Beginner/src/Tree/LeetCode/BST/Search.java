package Tree.LeetCode.BST;
public class Search
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
    public static Node search(Node root, int val)
    {
        if(root == null)
        {
            return null;
        }
        if(root.data == val)
        {
            return root;
        }
        else if(root.data < val)
        {
            return search(root.right, val);
        }
        else
        {
            return search(root.left, val);
        }
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
        }
        root = search(root,3);
        inorder(root);
    }
}
