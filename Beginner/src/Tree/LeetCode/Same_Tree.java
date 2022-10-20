package Tree.LeetCode;
/*
https://leetcode.com/problems/same-tree/
 */
public class Same_Tree
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
    static class BinaryTree1
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
    static class BinaryTree2
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
    public static boolean same(Node p, Node q)
    {
        if (p == null && q == null)
            return true;
        if (q == null || p == null)
            return false;
        if (p.data != q.data)
            return false;
        return same(p.right, q.right) && same(p.left, q.left);
    }
    public static void main(String[] args)
    {
        /*
        Two binary trees are considered the same if they are structurally identical, and the nodes
        have the same value.
                                    1                  1
                                  /   \              /   \
                                 2     3            2     3
        These two trees are same.
         */
        int[] nodes1={1,2,-1,-1,3,-1,-1};
        int[] nodes2={1,11,-1,-1,3,-1,-1};
        BinaryTree1 tree1=new BinaryTree1();
        BinaryTree2 tree2=new BinaryTree2();
        Node root1=tree1.buildTree(nodes1);
        Node root2=tree2.buildTree(nodes2);
        System.out.print(same(root1,root2));
    }
}