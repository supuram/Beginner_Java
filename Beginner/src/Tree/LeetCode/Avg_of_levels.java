package Tree.LeetCode;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
public class Avg_of_levels
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
    public static void avglevel(Node root)
    {
        if(root==null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        long sum = 0;
        int ct = 0;
        double avg;
        ArrayList<Double> arr = new ArrayList<>();
        while(!q.isEmpty())
        {
            Node currNode = q.remove();
            if(currNode == null)
            {
                avg = (double)sum/ct;
                arr.add(avg);
                sum = 0;
                ct = 0;
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
                ct++;
                sum = sum + currNode.data;
                if(currNode.left!=null)
                {
                    q.add(currNode.left);
                }
                if(currNode.right!=null)
                {
                    q.add(currNode.right);
                }
            }
        }
        System.out.print(arr);
    }
    public static void main(String[] args)
    {
        /*
        Given the root of a binary tree, return the average value of the nodes on each level in the form
        of an array.

                                3
                               / \
                              9   20
                                 /  \
                                15   7

        Output - [3.00000,14.50000,11.00000]


         */
        int[] nodes={3,9,-1,-1,20,15,-1,-1,7,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        avglevel(root);
    }
}
