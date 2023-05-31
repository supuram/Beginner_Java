package Tree.LeetCode.BST;
import java.util.*;
public class Min_Abs_Diff
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
        arr.add(root.data);
        return arr;
    }
    public static void main(String[] args)
    {
        /*
        Given the root of a Binary Search Tree (BST), return the minimum absolute difference between
        the values of any two different nodes in the tree.

                                        5
                                       / \
                                      1   7
                                       \
                                        3
                                       / \
                                      2   4

        Output = 1

         */
        int[] values = {236,104,227,701,911};
        //int[] values = {4,2,6,1,3};
        Node root = null;
        int i=0;
        for(;i<values.length;i++)
        {
            root = insert(root, values[i]);
        }
        System.out.println(MinAbsDiff(root));
        Collections.sort(arr);
        int min = Integer.MAX_VALUE, diff;
        for(int j=0;j<arr.size();j++)
        {
            for(int k=j+1;k<arr.size();k++)
            {
                diff = Math.abs(arr.get(j) - arr.get(k));
                if(diff < min)
                {
                    min = diff;
                }
            }
        }
        System.out.print(min+" ");
    }
}
