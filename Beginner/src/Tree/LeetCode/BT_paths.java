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
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree
    {
        int idx = -1;
        public Node buildTree(int[] nodes)
        {
            idx++;
            if(nodes[idx] == -1)
            {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
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
        System.out.print(res+":"+len+":"+root.data);
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
        System.out.print(res+","+len+","+root.data);
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
        int[] nodes = {1,2,4,8,-1,-1,9,10,-1,-1,11,-1,-1,5,-1,7,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        ArrayList<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        paths(res, root, sb);
        System.out.print("Paths of the Binary Trees = "+res);
    }
}

/*
The reason why sb.toString() is used instead of just adding sb to the result list is because sb is a
StringBuilder object, while the result list is an ArrayList of String objects. The toString() method converts
the StringBuilder object to a String object so that it can be added to the result list.

It is possible to make the result list an ArrayList of StringBuilder objects instead of String objects.
However, in this case, it would not be practical to do so.
The purpose of the result list is to store the final root-to-leaf paths as strings. String objects are
immutable, meaning that once they are created, their value cannot be changed. This makes them a good choice
for storing the final paths because we don’t want the paths to be modified once they are added to the result
list.
On the other hand, StringBuilder objects are mutable, meaning that their value can be changed after they are
created. This makes them a good choice for building the paths during the tree traversal because we need to add
and remove characters from the path as we traverse the tree.
In summary, using a String object to store the final paths and a StringBuilder object to build the paths
during the tree traversal is a practical design choice because it takes advantage of the immutability of
String objects and the mutability of StringBuilder objects.
 */