package Tree.LeetCode;
public class Symmetric_Tree_rightone
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
    public static void inorder(Node root)
    {
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean symmetric(Node root)
    {
        return isMirror(root.left, root.right);
    }
    public static boolean isMirror(Node node1, Node node2)
    {
        if (node1 == null && node2 == null)
        {
            System.out.println("true1"+" ");
            return true;
        }

        if (node1 == null || node2 == null)
        {
            System.out.println("false1"+" ");
            return false;
        }
        if (node1.data != node2.data)
        {
            System.out.println("false2"+" ");
            return false;
        }

        boolean b1 = isMirror(node1.left, node2.right);
        boolean b2 = isMirror(node1.right, node2.left);
        System.out.println(b1+" "+b2);
        return b1 && b2;
    }
    public static void main(String[] args)
    {
        /*
                                    1
                                  / | \
                                 2  |  2
                                / \ | / \
                               3   4|4   3
         */
        int[] nodes={1,2,3,-1,-1,84,-1,-1,2,4,-1,-1,3,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.print("Original Tree = ");
        inorder(root);
        System.out.println();
        System.out.print(symmetric(root));
    }
}