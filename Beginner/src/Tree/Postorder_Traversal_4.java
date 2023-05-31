package Tree;
/* Postorder Traversal means first print the left subtree, then print right subtree and then the root */
public class Postorder_Traversal_4
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
    public static void postorder(Node root)
    {
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args)
    {
        /*
                                    1
                             /              \
                           2                 14
                         /  \               /   \
                       4    10             20     3
                     /  \    /\                  /   \
                   7     9  11 12               6      5
                  \       \                      \     /  \
                   8       13                    19   15   16
                                                           /  \
                                                          17   18
                                                            \   /
                                                            20  21
         */

        int[] nodes = {1,2,4,7,-1,8,-1,-1,9,-1,13,-1,-1,10,11,-1,-1,12,-1,-1,14,20,-1,-1,3,6,-1,19,-1,-1,5,15,-1,-1,16,17,-1,20,-1,-1,18,21,-1,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        postorder(root);
    }
}
