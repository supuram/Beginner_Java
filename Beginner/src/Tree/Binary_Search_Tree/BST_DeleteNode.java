package Tree.Binary_Search_Tree;
public class BST_DeleteNode
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
    public static Node delete(Node root, int del)
    {
        if(root.data < del)
        {
            root.right = delete(root.right, del);
        }
        else if(root.data > del)
        {
            root.left = delete(root.left, del);
        }
        else
        {
            // The node to be deleted is a leaf node, i.e, both its left and right child are null
            if(root.left == null && root.right == null)
            {
                return null;
            }

            // The node to be deleted has a child node only at one side,i.e, either at left or at right
            if(root.left == null)
            {
                return root.right;
            }
            else if(root.right == null)
            {
                return root.left;
            }

            // The node to be deleted has child on both sides - at right as well as left.
            Node IS = findInOrderSuccessor(root.right);
            root.data = IS.data;
            System.out.print(root.data+" "+root.right.data+" "+IS.data+" ");
            root.right = delete(root.right, IS.data);
        }
        System.out.print(root.data+":");
        return root;
    }
    public static Node findInOrderSuccessor(Node root)
    {
        while(root.left != null)
        {
            root = root.left;
        }
        return root;
    }
    public static void main(String[] args)
    {
        /*
                                        8                                              8
                                      /   \                                          /   \
                                     5     10            del(5)                     6     10
                                    / \      \        ----------->                 /        \
                                   3   6      11                                  3          11
                                  /             \                                /             \
                                 1               14                             1               14

                                       50                                             57
                                     /    \                                         /    \
                                    40     70            del(50)                   40     70
                                          /   \        ----------->                      /  \
                                         60    80                                      60    80
                                        /                                             /
                                       59                                           59
                                      /                                            /
                                     58                                          58
                                    /
                                   57

            6, 60 in the above two trees is known as inorder successor of 5 and 50 respectively. When you want to delete
            5 or 50 in the two trees, find the inorder successor of them and link them to the parent of 5 or 50.
            Inorder successor in BST = left most node in right subtree.

         */
        //int[] values = {8,5,3,1,4,6,10,11,14};
        int[] values = {50,40,70,60,59,58,57,80};
        Node root = null;
        int i=0;
        for(;i<values.length;i++)
        {
            root = insert(root, values[i]);
        }
        System.out.print("Before Deletion = ");
        inorder(root);
        System.out.println();
        delete(root,50);
        System.out.println();
        System.out.print("After Deletion = ");
        inorder(root);
    }
}
