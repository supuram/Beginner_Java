package Tree.LeetCode;
import java.util.ArrayList;

public class BT_paths
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
    public static void paths(ArrayList<String> res, Node root, StringBuilder sb)
    {
        if(root == null)
        {
            return;
        }
        int len = sb.length();
        sb.append(root.data);
        System.out.print(res+":"+len);
        System.out.println();
        if(root.left == null && root.right == null)
        {
            res.add(sb.toString());
        }
        else
        {
            sb.append("->");
            paths(res, root.left, sb);
            paths(res, root.right, sb);
        }
        System.out.print(res+","+len);
        System.out.println();
        sb.setLength(len);
    }
    public static void main(String[] args)
    {
        /*

                                1
                               /  \
                              2    3
                             /  \    \
                            4    5    6
                           / \    \
                          8   9    7
                             / \
                            10  11

          Output -
          1,2,4,8
          1,2,4,9,10
          1,2,4,9,11
          1,2,5,7
          1,3,6

         */
        int[] nodes={1,2,4,8,-1,-1,9,10,-1,-1,11,-1,-1,5,-1,7,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        ArrayList<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        paths(res, root, sb);
        System.out.print("Paths of the Binary Trees = "+res);
    }
}
