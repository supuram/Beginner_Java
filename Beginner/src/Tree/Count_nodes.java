package Tree;
import java.util.LinkedList;
import java.util.Queue;

public class Count_nodes
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
    public static void levelorder(Node root)
    {
        if(root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int ct=1;
        while(!q.isEmpty())
        {
            Node currNode=q.poll();
            if(currNode==null)
            {
                if(q.isEmpty())
                {
                    break;
                }
                else
                {
                    q.add(null);
                }
            }
            else
            {
                if(currNode.left!=null)
                {
                    ct++;
                    q.add(currNode.left);
                }
                if(currNode.right!=null)
                {
                    ct++;
                    q.add(currNode.right);
                }
            }
        }
        System.out.println("Total number of nodes = "+ct);
    }
    public static void main(String[] args)
    {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        levelorder(root);
    }
}
