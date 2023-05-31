package Tree.LeetCode.BST;
import java.util.*;
public class Adjacent_Abs_Diff
{
    static ArrayList<Integer> arr = new ArrayList<>();
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
    public static ArrayList<Integer> MinAbsDiff(Node root)
    {
        if(root == null)
            return arr;
        MinAbsDiff(root.left);
        MinAbsDiff(root.right);
        if(root.left != null && root.right != null)
        {
            int s = Math.abs(root.data-root.left.data);
            int s1 = Math.abs(root.data-root.right.data);
            arr.add(s);
            arr.add(s1);
            //System.out.print("["+s+","+s1+"]"+" ");
        }
        else if(root.left == null && root.right != null)
        {
            arr.add(Math.abs(root.data-root.right.data));
        }
        else if(root.left != null)
        {
            arr.add(Math.abs(root.data-root.left.data));
        }
        return arr;
    }
    public static void main(String[] args)
    {
        /*
        Given the root of a Binary Search Tree (BST), return the minimum absolute difference between
        the values of adjacent nodes in the tree.
        The leetcode prolem was a bit different. I changed it as I first mistakenly coded this.

                                        5
                                       / \
                                      1   7
                                       \
                                        3
                                       / \
                                      2   4

        Output = 1

         */
        int[] values = {5,1,3,4,2,7};
        Node root = null;
        int i=0;
        for(;i<values.length;i++)
        {
            root = insert(root, values[i]);
        }
        System.out.println(MinAbsDiff(root));
        Collections.sort(arr);
        System.out.print("Adjacent Absolute Difference = "+arr.get(0));
    }
}
