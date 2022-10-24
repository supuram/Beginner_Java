package Tree.Binary_Search_Tree;
import java.util.ArrayList;
public class BST_to_BalancedBST
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
    public static Node balanced(ArrayList<Integer> arr, int st, int end)
    {
        if(st > end)
        {
            return null;
        }
        int mid = (st + end)/2;
        Node root = new Node(arr.get(mid));
        root.left = balanced(arr,st,mid-1);
        root.right = balanced(arr,mid+1,end);
        return root;
    }
    public static void inorder(Node root, ArrayList<Integer> arr)
    {
        if(root==null)
            return;
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }
    public static String strfromBT(Node root)
    {
        if(root == null)
            return "";
        String s = "";
        if(root.left == null && root.right == null)
            s = s + "";
        if(root.left != null)
            s = s + ("("+ strfromBT(root.left)+")");
        if(root.left == null && root.right != null)
            s = s+ "()";
        if(root.right != null)
            s = s + ("("+ strfromBT(root.right)+")");
        return root.data + s;
    }
    public static void main(String[] args)
    {
        /*
        BST to Balanced BST

                           8                                  8
                         /   \                              /   \
                        6     10                           5     11
                       /        \          ------>        / \    / \
                      5          11                      3   6  10  12
                     /             \
                    3               12

         */
        int[] values = {8,6,5,3,10,11,12};
        Node root = null;
        int i=0;
        for(;i<values.length;i++)
        {
            root = insert(root, values[i]);
        }
        ArrayList<Integer>  arr = new ArrayList<>();
        inorder(root,arr);
        System.out.println(arr);
        root = balanced(arr,0,arr.size()-1); /* If you do not write this 'root = balanced'
        and instead only write balanced() you will not get the desired result. */
        System.out.print(strfromBT(root));
    }
}
