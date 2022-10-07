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
        System.out.print("("+left+" "+right+")");

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
                                   / \
                                  2   3
                                 / \   \
                                4   5   6
          If node = 5, k = 2, it means find the 2nd ancestor of 5. The answer will be 1.
         */
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(kth(root, 5,2));
    }
}