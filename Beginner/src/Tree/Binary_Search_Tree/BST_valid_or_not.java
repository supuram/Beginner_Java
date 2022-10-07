package Tree.Binary_Search_Tree;
public class BST_valid_or_not
{
    static class Node
    {
        int data;
        Node left, right;
        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
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
    public static boolean validBST(Node root, Node min, Node max)
    {
        if(root == null)
        {
            return true;
        }
        if(min != null && root.data <= min.data)
        {
            return false;
        }
        else if(max != null && root.data >= max.data)
        {
            return false;
        }
        boolean l = validBST(root.left, min, root);
        boolean r = validBST(root.right, root, max);
        boolean result = l && r;
        System.out.print("["+l+","+r+","+result+","+root.data+"]"+" "); // for dry run purpose
        System.out.println();
        return result;
    }
    public static void main(String[] args)
    {
        /*
        Check whether a given BST is valid or not
                                        8
                                      /   \
                                     5     10
                                    / \      \
                                   3   6      11
                                  / \           \
                                 1   4           14
        Output- Valid
         */
        int[] nodes={8,5,3,1,-1,-1,4,-1,-1,9,-1,-1,10,-1,11,-1,14,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.print(validBST(root,null,null));
    }
}
