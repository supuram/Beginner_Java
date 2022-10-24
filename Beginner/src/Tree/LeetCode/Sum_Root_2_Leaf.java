package Tree.LeetCode;
import java.util.ArrayList;

public class Sum_Root_2_Leaf
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
        sb.setLength(len);
    }
    public static void binary(ArrayList<String> res)
    {
        int len = res.size();
        int[] arr = new int[len];
        int[] arr1 = new int[len];
        int[] arr2 = new int[len];

        // Calculates length of the path for the binary tree
        for(int i=0;i<len;i++)
        {
            arr[i] = num(res.get(i));
        }

        // Create binary numbers from digits
        for(int i=0;i<len;i++)
        {
            arr1[i] = createBinaryNum(res.get(i),arr[i]);
            //System.out.print(arr1[i]+",");
        }
        int sum =0;
        // Decimal to Binary
        for(int i=0;i<len;i++)
        {
            arr2[i] = DecimalToBinary(arr1[i]);
            sum = sum + arr2[i];
        }
        System.out.print(sum);
    }
    public static int num(String str)
    {
        int len = str.length();
        int i=0;
        int ct = 0;
        for(;i<len;i++)
        {
            if(str.charAt(i) == '0' || str.charAt(i) == '1')
            {
                ct++;
            }
        }
        return ct;
    }
    public static int createBinaryNum(String str, int len)
    {
        int s=0;
        int k = len-1;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == '0' || str.charAt(i) == '1')
            {
                int a = str.charAt(i) - '0'; // Converting char to integer
                s = s+ a * (int)Math.pow(10,k);
                k--;
            }
        }
        //System.out.print(s+",");
        return s;
    }
    public static int DecimalToBinary(int num)
    {
        int ct = 1, i, rem, decimal = 0;
        int binary = num;
        while ((num / 10) != 0) {
            ct = ct + 1;
            num = num / 10;
        }

        for (i = ct; i >= 1; i--)
        {
            int p = ct - i;
            rem = binary % 10;
            decimal = decimal + rem * (int) (Math.pow(2, p));
            binary = binary / 10;
        }
        return decimal;
    }
    public static void main(String[] args)
    {
        /*
        You are given the root of a binary tree where each node has a value 0 or 1. Each root-to-leaf path
        represents a binary number starting with the most significant bit.
        For all leaves in the tree, consider the numbers represented by the path from the root to that leaf.
        Return the sum of these numbers.

                                1
                              /   \
                             0      1
                            / \    / \
                           0   1  0   1

         Output = 100 + 101 + 110 + 111 = 4 + 5 + 6 + 7 = 22

         */
        int[] nodes={1,0,0,-1,-1,1,-1,-1,1,0,-1,-1,1,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        ArrayList<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        paths(res, root, sb);
        System.out.println("Paths of the Binary Trees = "+res);
        //System.out.print("Paths of the Binary Trees = "+res.get(2).charAt(6));
        binary(res);
    }
}
