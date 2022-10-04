package Tree;
public class subtree
{
    /*
    Subtree of another Tree
    Given the roots of two binary trees and subroot, return true if there is a subtree of root within the
    same structure and node values of subroot and false otherwise.
     */

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
    public static boolean isIdentical(Node root, Node subroot)
    {
        if(root == null && subroot == null)
        {
            return true;
        }
        else if(root == null || subroot == null || root.data!=subroot.data)
        {
            return false;
        }
        if(!isIdentical(root.left,subroot.left))
        {
            return false;
        }
        if(!isIdentical(root.right,subroot.right))
        {
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root, Node subroot)
    {
        if(root == null)
        {
            return false;
        }
        if(root.data == subroot.data)
        {
            if(isIdentical(root,subroot))
            {
                return true;
            }
        }
        boolean left=isSubtree(root.left,subroot);
        boolean right=isSubtree(root.right,subroot);
        return left || right;
    }
    public static void main(String[] args)
    {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        Node subroot=new Node(2);
        subroot.left=new Node(4);
        subroot.right=new Node(5);
        System.out.print(isSubtree(root,subroot));
    }
}