package Tree;
public class kth_ancestor
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
    public static int kth(Node root, int n, int k)
    {
        if(root == null)
        {
            return -1;
        }
        if(root.data == n)
        {
            return 0;
        }
        int left = kth(root.left,n,k);
        int right = kth(root.right,n,k);
        System.out.print("("+left+","+right+","+root.data+")");

        if(left == -1 && right == -1)
        {
            return -1;
        }
        int max = Math.max(left, right);
        if(max+1 == k)
        {
            System.out.println();
            System.out.println("Ancestor = "+root.data+" ");
        }
        return max+1;
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
          If node = 5, k = 2, it means find the 2nd ancestor of 5. The answer will be 14.
         */
        int[] nodes = {1,2,4,7,-1,8,-1,-1,9,-1,13,-1,-1,10,11,-1,-1,12,-1,-1,14,20,-1,-1,3,6,-1,19,-1,-1,5,15,-1,-1,16,17,-1,20,-1,-1,18,21,-1,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(kth(root, 21,6));
    }
}