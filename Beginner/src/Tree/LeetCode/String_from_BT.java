package Tree.LeetCode;
public class String_from_BT
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
    public static String strfromBT(Node root)
    {
        if(root == null)
            return "";
        String s = "";
        if(root.left == null && root.right == null)
            s = s + "";
        if(root.left != null)
            s = s + ("("+ strfromBT(root.left)+")");
        if(root.left == null && root.right != null)
            s = s+ "()";
        if(root.right != null)
            s = s + ("("+ strfromBT(root.right)+")");
        System.out.println(root.data+s);
        return root.data + s;
    }
    public static void main(String[] args)
    {
        /*
        Given the root of a binary tree, construct a string consisting of parenthesis and integers from a
        binary tree with the preorder traversal way, and return it.
        Omit all the empty parenthesis pairs that do not affect the one-to-one mapping relationship
        between the string and the original binary tree.

                                1
                               / \
                              2   3
                             /
                            4
    Output - 1(2(4))(3)

                                1
                               / \
                              2   3
                               \
                                4
    Output - 1(2()(4))(3)
         */
        int[] nodes={1,2,-1,4,-1,-1,3,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.print(strfromBT(root));
    }
}
