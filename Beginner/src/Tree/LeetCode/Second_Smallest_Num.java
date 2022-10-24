package Tree.LeetCode;
import java.util.HashSet;
import java.util.Set;
public class Second_Smallest_Num
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
    public static int secondmin(Node root)
    {
        Set<Integer> uniques = new HashSet<>();
        dfs(root,uniques);
        int min1 = root.data;
        long ans = Long.MAX_VALUE;
        for (int v : uniques)
        {
            if (min1 < v && v < ans) ans = v;
        }
        return ans < Long.MAX_VALUE ? (int) ans : -1;
    }
    public static void dfs(Node root, Set<Integer> uniques)
    {
        if (root != null)
        {
            uniques.add(root.data);
            System.out.println(uniques);
            dfs(root.left, uniques);
            dfs(root.right, uniques);
        }
    }
    public static void main(String[] args)
    {
        /*
        Given a non-empty special binary tree consisting of nodes with the non-negative value, where each
        node in this tree has exactly two or zero sub-node. If the node has two sub-nodes, then this node's
        value is the smaller value among its two sub-nodes. More formally, the property
        root.val = min(root.left.val, root.right.val) always holds.
        Given such a binary tree, you need to output the second minimum value in the set made of all the
        nodes' value in the whole tree.
        If no such second minimum value exists, output -1 instead.

                                2
                               / \
                              2   5
                                 / \
                                5   7

        Output - 2

         */
        int[] nodes={2,2,-1,-1,5,5,-1,-1,7,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.print(secondmin(root));
    }
}
