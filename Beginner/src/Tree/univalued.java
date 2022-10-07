package Tree;
public class univalued
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
    public static boolean uni(Node root)
    {
        if(root == null)
        {
            return true;
        }
        if(root.left != null && root.data != root.left.data)
        {
            return false;
        }
        if(root.right != null && root.data != root.right.data)
        {
            return false;
        }
        boolean a= uni(root.left);
        boolean b= uni(root.right);
        boolean c= a && b;
        System.out.print(a+" "+b+" "+c+",");
        return c;
    }
    public static void main(String[] args)
    {
        /*
                                    1
                                   / \
                                  1   1
                                 / \ / \
                                1  1 1  1
             This will return true
         */
        int[] nodes={1,1,1,-1,-1,1,-1,-1,1,1,-1,-1,1,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.print(uni(root));
    }
}