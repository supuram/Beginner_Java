package Tree;
public class mirror_image
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
    public static Node mirror(Node root)
    {
        if(root == null)
        {
            return root;
        }
        Node left = mirror(root.left);
        Node right = mirror(root.right);

        // This code snippet is just a part of dry run, to visualize the values. Nothing to do with the actual code.
        if(left==null || right==null)
            System.out.print("0"+","+"0"+" ");
        else
            System.out.print(left.data+","+right.data+" ");

        root.left=right;
        root.right=left;
        return root;
    }
    public static void main(String[] args)
    {
        /*
                                    1             |             1
                                   / \            |            / \
                                  2   3           |           3   2
                                 / \ / \          |          / \ / \
                                4  5 6  7         |         7  6 5  4
         */
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.print("Original Tree = ");
        inorder(root);
        System.out.println();
        mirror(root);
        System.out.println();
        System.out.print("Mirror Image Tree = ");
        inorder(root);
    }
}