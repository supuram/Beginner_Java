package Tree.LeetCode;
public class Symmetric_Tree
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
        /*
        This is a wrong code snippet. It will give true for any tree. It is actually not checking
        symmetry. But I will keep this to show how not to write a code. Just run this and you will
        understand how this works. I have already printed the values to better understand the running.
         */
        if(root == null)
        {
            return true;
        }
        if(root.right.data != root.left.data)
            return false;
        boolean l = symmetric(root.left);
        boolean r = symmetric(root.right);
        boolean res = l&& r;
        System.out.print(root.data+":"+l+" "+root.data+";"+r+" "+res+",");
        return res;
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
        int[] nodes={1,2,3,-1,-1,4,-1,-1,2,4,-1,-1,3,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.print("Original Tree = ");
        inorder(root);
        System.out.println();
        System.out.print(symmetric(root));
        System.out.println();
        System.out.print("Mirror Image Tree = ");
        inorder(root);
    }
}