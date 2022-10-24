package Tree.LeetCode;
public class Merge_two_BT
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
    static class BinaryTree1
    {
        int idx=-1;
        public Node buildTree1(int[] nodes1)
        {
            idx++;
            if(nodes1[idx]==-1)
            {
                return null;
            }
            Node newNode=new Node(nodes1[idx]);
            newNode.left=buildTree1(nodes1);
            newNode.right=buildTree1(nodes1);
            return newNode;
        }
    }
    static class BinaryTree2 {
        int idx = -1;
        public Node buildTree2(int[] nodes2)
        {
            idx++;
            if(nodes2[idx]==-1)
            {
                return null;
            }
            Node newNode=new Node(nodes2[idx]);
            newNode.left=buildTree2(nodes2);
            newNode.right=buildTree2(nodes2);
            return newNode;
        }

    }
    public static Node merge(Node root1, Node root2)
    {
        if(root1 == null && root2 == null)
        {
            return null;
        }
        if(root1 == null)
        {
            return root2;
        }
        if(root2 == null)
        {
            return root1;
        }
        Node root = new Node(root1.data + root2.data);
        System.out.println(root.data+" ");
        root.left = merge(root1.left,root2.left);
        root.right = merge(root1.right,root2.right);
        //System.out.println(root.data+" ");
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
        Imagine that when you put one of them to cover the other, some nodes of the two trees are
        overlapped while the others are not. You need to merge the two trees into a new binary tree.
        The merge rule is that if two nodes overlap, then sum node values up as the new value of the
        merged node. Otherwise, the NOT null node will be used as the node of the new tree.

                                1                 2                         3
                               / \               / \                       / \
                              3   2    +        5   3     ----->          8   5
                             /                   \   \                   / \   \
                            5                     4   7                 5   4   7

         */
        int[] nodes1 = {1,3,5,-1,-1,-1,2,-1,-1};
        int[] nodes2 = {2,5,-1,4,-1,-1,3,-1,7,-1,-1};
        BinaryTree1 tree1 = new BinaryTree1();
        BinaryTree2 tree2 = new BinaryTree2();
        Node root1 = tree1.buildTree1(nodes1);
        Node root2 = tree2.buildTree2(nodes2);
        inorder(merge(root1, root2));
    }
}
