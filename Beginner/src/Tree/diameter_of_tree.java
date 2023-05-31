package Tree;
import java.lang.Math;
public class diameter_of_tree
{
    /* Diameter of a tree is defined as the number of nodes in the longest path between two leaves
                                1
                               /  \
                              2    3
                             /  \    \
                            4    5    6
                           /
                          7
      Here the longest diameter is 7-4-2-1-3-6.

                                1
                               /  \
                              2    3
                             /  \
                            4    5
                           /      \
                          7        8
                         /          \
                        9            10
       Here the longest diameter is 9-7-4-2-5-8-10.
     */
    static class Node
    {
        int data;
        Node left,right;
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree
    {
        int idx = -1;
        public Node buildTree(int[] nodes)
        {
            idx++;
            if(nodes[idx] == -1)
            {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    public static int height(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int diameter(Node root)
    {
        if(root == null)
        {
            System.out.print(0+":");
            return 0;
        }
        int ld = diameter(root.left);
        int rd = diameter(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        System.out.println("["+ld+","+rd+","+lh+","+rh+","+root.data+"]");
        int self = lh+rh+1;
        return Math.max(Math.max(ld,rd),self);
    }
    public static void main(String[] args)
    {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.print(diameter(root));
    }
}