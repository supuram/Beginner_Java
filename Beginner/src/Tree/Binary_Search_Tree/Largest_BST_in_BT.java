package Tree.Binary_Search_Tree;
public class Largest_BST_in_BT
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
    static class Info
    {
        boolean isBST;
        int size, max, min;
        public Info(boolean isBST, int size, int min, int max)
        {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }
    public static int maxBST = 0;
    public static Info largestBST(Node root)
    {
        if(root == null)
        {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
        int max = Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));

        if(root.data <= leftInfo.max || root.data >= rightInfo.min)
        {
            return new Info(false, size, min, max);
        }
        if(leftInfo.isBST && rightInfo.isBST)
        {
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);
    }
    public static void main(String[] args)
    {
        /*
                        50                              60
                       /  \                            /  \
                      30   60      ------>            45   70
                     / \   / \                            /  \
                    5  20 45  70                         65   80
                              / \
                             65  80
         */
        int[] nodes={50,30,5,-1,-1,20,-1,-1,60,45,-1,-1,70,65,-1,-1,80,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        largestBST(root);
        System.out.print("Size of Maximum BST = "+maxBST);
    }
}