package Tree.LeetCode;
public class Sum_left_nodes
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
    public static int left(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        return sumleft(root.left, true)+sumleft(root.right,false);
    }
    public static int sumleft(Node root,boolean isTrue)
    {
        if(root == null)
        {
            return 0;
        }
        if(root.left == null && root.right == null && isTrue)
        {
            return root.data;
        }
        int s = sumleft(root.left,true) + sumleft(root.right,false);
        System.out.print(s+" ");
        return s;
    }
    public static void main(String[] args)
    {
        /*
        Given the root of a binary tree, return the sum of all left leaves.
        A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.

                                 1
                               /   \
                              2     3
                             /  \     \
                            4    5     6
                           / \    \   /
                          8   9    7 12
                             / \
                            10  11

          Output - 10 + 8 + 12 = 30

         */

        int[] nodes={1,2,4,8,-1,-1,9,10,-1,-1,11,-1,-1,5,-1,7,-1,-1,3,-1,6,12,-1,-1,-1};
        //int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.print(left(root));
    }
}
