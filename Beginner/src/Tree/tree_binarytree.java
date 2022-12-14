package Tree;
public class tree_binarytree
{
    // https://www.youtube.com/watch?v=-DzowlcaUmE&t=2988s
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
                System.out.print("-1"+" ");
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            System.out.print("("+newNode.data+")");
            newNode.right=buildTree(nodes);
            System.out.print("["+newNode.data+"]");
            System.out.println();
            return newNode;
        }
    }
    public static void main(String[] args)
    {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(root.data);
    }
}