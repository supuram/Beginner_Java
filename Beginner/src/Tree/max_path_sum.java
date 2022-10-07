package Tree;
public class max_path_sum
{
    static int min=Integer.MIN_VALUE;
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
    public static int maxpath(Node root)
    {
        // This code is incorrect. I will do this later as it is a hard problem in leetcode.
        if(root == null)
        {
            return 0;
        }
        int l=maxpath(root.left);
        int r=maxpath(root.right);
        int sum = l+r+root.data;
        if(sum > min)
        {
            min = sum;
        }
        System.out.print("["+l+","+r+","+root.data+","+sum+","+min+"]"+" ");
        return sum;
    }
    public static void main(String[] args)
    {
        /*
        Maximum Path Sum in a Binary Tree
                                   -10
                                  /   \
                                 9     20
                                       / \
                                      15  7
             Output = 42
         */
        Node root=new Node(-10);
        root.left=new Node(9);
        root.right=new Node(20);
        root.right.left=new Node(15);
        root.right.right=new Node(7);
        System.out.print(maxpath(root));
    }
}