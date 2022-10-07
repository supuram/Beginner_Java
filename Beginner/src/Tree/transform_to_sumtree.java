package Tree;
public class transform_to_sumtree
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
    public static int sumtree(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int left = sumtree(root.left);
        int right = sumtree(root.right);
        int data = root.data;
        System.out.print(data+" ");    // dry run
        int newleft = root.left == null ? 0 : root.left.data;
        int newright = root.right == null ? 0 : root.right.data;
        System.out.print("("+left+","+right+":"+newleft+","+newright+")"+" ");   // dry run
        root.data = left + right + newleft + newright;
        System.out.print(data+","+" ");    // dry run
        return data;
    }
    public static void preorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args)
    {
        /*
                                    1                             27
                                  /   \                          /  \
                                 2     3     ------>            9    13
                                / \   / \                      / \   / \
                               4   5 6   7                    0   0 0   0
         */
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        sumtree(root);
        preorder(root);
    }
}