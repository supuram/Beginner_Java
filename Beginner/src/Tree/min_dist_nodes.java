package Tree;
import java.util.ArrayList;
public class min_dist_nodes
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
    public static boolean getpath(Node root, int n, ArrayList<Node> path)
    {
        if(root == null)
        {
            return false;
        }
        path.add(root);
        if(root.data == n)
        {
            return true;
        }
        if(getpath(root.left, n, path) || getpath(root.right, n, path))
        {
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public static int min(Node root, int n1, int n2)
    {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getpath(root,n1,path1);
        getpath(root,n2,path2);

        int i=0;
        for(;i<path1.size() && i<path2.size();i++)
        {
            if(path1.get(i) != path2.get(i))
            {
                break;
            }
        }

        int j=i-1,ct1=0;
        for(;j<path1.size();j++)
        {
            ct1++;
            if(path1.get(j).data == n1)
            {
                break;
            }
        }

        j=i-1;
        for(;j<path2.size();j++)
        {
            ct1++;
            if(path2.get(j).data == n2)
            {
                break;
            }
        }
        return ct1-2;
    }
    public static void main(String[] args)
    {
        /*
                                    1
                                   / \
                                  2   3
                                 / \   \
                                4   5   6
          Minimum Distance between two nodes 4 and 6 is 4, between 2 and 6 is 3 etc.
         */
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(min(root, 2,3));
    }
}