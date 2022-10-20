package Tree.Binary_Search_Tree;
public class Sorted_array_to_BST
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
    public static Node insert(int[] arr, int st, int end)
    {
        if(st > end)
        {
            return null;
        }
        int mid = (st + end)/2;
        Node root = new Node(arr[mid]);
        System.out.print("["+root.data+","+mid+","+st+","+end+"]"+" ");
        root.left = insert(arr,st,mid-1);
        root.right = insert(arr,mid+1,end);
        System.out.print(mid+":");
        return root;
    }
    public static void inorder(Node root)
    {
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args)
    {
        /*
        Sorted Array to Balanced BST. Balanced BST has the minimum height.
        array = [3,6,5,8,10,11,12]

                                        8
                                      /   \
                                     5     11
                                    / \    / \
                                   3   6  10  12

         */
        int[] values = {3,6,5,8,10,11,12};
        Node root = insert(values,0,values.length-1 );
        System.out.println();
        inorder(root);
    }
}
