package Tree.Binary_Search_Tree;
import java.util.ArrayList;
public class BST_Root_to_leaf_path
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
    public static void printpath(ArrayList<Integer> path)
    {
        int i=0;
        for(;i<path.size();i++)
        {
            System.out.print(path.get(i)+" ");
        }
        System.out.println();
    }
    public static void roottoleaf(Node root, ArrayList<Integer> path)
    {
        if(root == null)
        {
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null)
        {
            printpath(path);
        }
        roottoleaf(root.left,path);
        roottoleaf(root.right,path);
        path.remove(path.size()-1);
    }
    public static void main(String[] args)
    {
        /*
                                        8
                                      /   \
                                     5     10
                                    / \      \
                                   3   6      11
                                  / \           \
                                 1   4           14
        Output-
        8-5-3-1
        8-5-3-4
        8-5-6
        8-10-11-14
         */

        int[] values = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        int i=0;
        for(;i<values.length;i++)
        {
            root = insert(root, values[i]);
        }
        roottoleaf(root, new ArrayList<>());
    }
}
