package Tree;
import java.lang.Math;
public class height_of_tree
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
    public static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static void main(String[] args)
    {
        /*
                                1
                               /  \
                              2    3
                             /  \    \
                            4    5    6
         */
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(height(root));
    }
}