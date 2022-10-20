package Tree.LeetCode;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Collections;

public class ZigZag_Level_Order
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
    public static void zigzaglevelorder(Node node, ArrayList<ArrayList<Integer>> arr)
    {
        if (node.left == null && node.right == null)
        {
            ArrayList<Integer> sub = new ArrayList<>();
            sub.add(node.data);
            arr.add(sub);
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        int level = 1;
        while (!q.isEmpty())
        {
            int size = q.size();
            ArrayList<Integer> sub = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node n = q.remove();
                if (n.left != null)
                    q.add(n.left);
                if (n.right != null)
                    q.add(n.right);
                sub.add(n.data);
            }
            if (level % 2 != 0)
                Collections.reverse(sub);
            arr.add(sub);
            level++;
        }
    }
    public static void main(String[] args)
    {
        /*
        Given the root of a binary tree, return the zigzag level order traversal of its nodes' values.
        (i.e., from left to right, then right to left for the next level and alternate between).

                                1
                               /  \
                              2    3
                             /  \    \
                            4    5    6

          Output - (1), (2,3), (6,5,4)     OR     (1), (3,2), (4,5,6)

                                 1
                               /   \
                              2     3
                             /  \     \
                            4    5     6
                           / \    \   /
                          8   9    7 12
                             / \
                            10  11

         */
        //int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int[] nodes={1,2,4,8,-1,-1,9,10,-1,-1,11,-1,-1,5,-1,7,-1,-1,3,-1,6,12,-1,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        ArrayList<ArrayList<Integer>> zigZag = new ArrayList<>();
        zigzaglevelorder(root,zigZag);
        System.out.print(zigZag);
    }
}
