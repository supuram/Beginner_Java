package Tree.LeetCode;
public class BT_Tilt
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
    public static int tilt(Node root)
    {
        if(root == null)
        {
            System.out.print("[0"+"]");
            return 0;
        }
        int l = tilt(root.left);
        int r = tilt(root.right);
        int ab = Math.abs(sum(root.left) - sum(root.right));
        System.out.print("["+ab+":"+l+":"+r+":"+root.data+"]");
        return ab + l + r;
    }
    public static int sum(Node root)
    {
        if(root == null)
        {
            //System.out.print("(0"+")");
            return 0;
        }
        //System.out.print("("+root.data+":"+root.left+":"+root.right+")");
        return root.data + sum(root.left) + sum(root.right);
    }
    public static void main(String[] args)
    {
        /*
        Given the root of a binary tree, return the sum of every tree node's tilt.

    The tilt of a tree node is the absolute difference between the sum of all left subtree node values
    and all right subtree node values. If a node does not have a left child, then the sum of the left
    subtree node values is treated as 0. The rule is similar if the node does not have a right child.

     a)                         4                            6
                              /   \                        /   \
                             2     9     ------>          2     7
                            / \     \                   /   \    \
                           3   5     7                 0     0    0
    Output: 15
    Explanation:
    Tilt of node 3 : |0-0| = 0 (no children)
    Tilt of node 5 : |0-0| = 0 (no children)
    Tilt of node 7 : |0-0| = 0 (no children)
    Tilt of node 2 : |3-5| = 2 (left subtree is just left child, so sum is 3; right subtree is just
    right child, so sum is 5)
    Tilt of node 9 : |0-7| = 7 (no left child, so sum is 0; right subtree is just right child, so
    sum is 7)
    Tilt of node 4 : |(3+5+2)-(9+7)| = |10-16| = 6 (left subtree values are 3, 5, and 2, which sums
    to 10; right subtree values are 9 and 7, which sums to 16)
    Sum of every tilt : 0 + 0 + 0 + 2 + 7 + 6 = 15

     b)                         21                           2
                               /  \                        /   \
                              7    14    ---->            5     4
                             / \   / \                   / \   /  \
                            1   4 2   6                 2   0 0    0
                           / \                         / \
                          3   5                       0   0

          Output - 13

         */
        int[] nodes={21,7,1,3,-1,-1,5,-1,-1,4,-1,-1,14,2,-1,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.print(tilt(root));
    }
}
