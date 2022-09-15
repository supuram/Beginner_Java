package Tree;
/*  Say our tree is {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}.
So if level =3 is given as input, output will be - 4,5,6
 */
public class Print_any_level
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
    public static void levelorder(Node root,int level)
    {
        if(root==null)
            return;
        if(level==1)
            System.out.print(root.data+" ");
        else if(level>1) {
            levelorder(root.left,level-1);
            levelorder(root.right,level-1);
        }
    }
    public static void main(String[] args)
    {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        levelorder(root,3);
    }
}
