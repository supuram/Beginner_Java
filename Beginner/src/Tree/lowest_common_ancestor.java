package Tree;
import java.util.ArrayList;
public class lowest_common_ancestor
{
    // Time complexity = O(n)
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
            System.out.print("false"+" ");
            return false;
        }
        path.add(root);
        if(root.data == n)
        {
            System.out.println("true");
            return true;
        }

        System.out.print(root.data+" ");
        boolean left = getpath(root.left, n, path);
        System.out.print("["+left+","+root.data+"]"+" ");
        boolean right = getpath(root.right, n, path);
        System.out.print("{"+right+","+root.data+"}"+" ");

        if(left || right)
        {
            System.out.println("(true)");
            return true;
        }

        int j=0;
        for(;j<path.size();j++)
        {
            System.out.print("("+path.get(j).data+")"+" ");
        }

        path.remove(path.size()-1);
        return false;
    }
    public static Node lca(Node root, int n1, int n2)
    {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getpath(root, n1, path1);
        System.out.println();
        getpath(root, n2, path2);
        System.out.println();

        // Printing the path to better understand the code
        int j=0;
        for(;j<path1.size();j++)
        {
            System.out.print(path1.get(j).data+" ");
        }
        System.out.println();
        j=0;
        for(;j<path2.size();j++)
        {
            System.out.print(path2.get(j).data+" ");
        }
        System.out.println();

        // Finding the LCA
        int i=0;
        for(;i<path1.size() && i<path2.size();i++)
        {
            if(path1.get(i) != path2.get(i))
            {
                break;
            }
        }
        return path1.get(i-1);
    }
    public static void main(String[] args)
    {
        /*
                                    1
                                   / \
                                  2   3
                                 / \   \
                                4   5   6
          Here the lowest common ancestor (lca) of 4 and 5 is 2. Similarly lca of 4 and 6 is 1.
         */
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println("LCA = "+lca(root,2,5).data);
    }
}
