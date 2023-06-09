public class chk
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
    public static int sum(Node root)
    {
        if(root == null)
        {
            System.out.print("(0"+")");
            return 0;
        }
        System.out.print("("+root.data+":"+root.left+":"+root.right+")");
        return root.data + sum(root.left) + sum(root.right);
    }
    public static void main(String[] args)
    {
        int[] nodes={21,7,1,3,-1,-1,5,-1,-1,4,-1,-1,14,2,-1,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.print(sum(root));
    }
}