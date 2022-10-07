package Tree;
public class kth_level
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
    public static void kthlevel(Node root, int level, int k)
    {
        if(root==null)
            return;
        if(level == k)
        {
            System.out.print(root.data+" ");
            return;
        }
        kthlevel(root.left, level+1, 3);
        kthlevel(root.right, level+1, 3);
    }
    public static void main(String[] args)
    {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        kthlevel(root,1,3);
    }
}
