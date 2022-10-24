package Tree.LeetCode;
public class Smallest_Num
{
    static int min = Integer.MAX_VALUE;
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
    static class BinaryTree
    {
        int idx=-1;
        public Node buildTree(int[] nodes)
        {
            idx++;
            if(nodes[idx]==-1)
            {
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }
    public static int smallest(Node root)
    {
        if(root==null)
            return 0;
        smallest(root.left);
        smallest(root.right);
        if(root.data < min)
        {
            min = root.data;
        }
        return min;
    }
    public static void main(String[] args)
    {
        /*
        Given the root of a binary tree, return the smallest value of the nodes.

                                3
                               / \
                              9   20
                                 /  \
                                15   2

        Output - 2

         */
        int[] nodes={3,9,-1,-1,20,15,-1,-1,2,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.print(smallest(root));
    }
}
