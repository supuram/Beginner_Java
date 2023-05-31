package Tree;
import java.util.Scanner;
public class User_Input_Tree
{
    // Code is not by me, but by Bing
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
        public Node buildTree(Scanner sc)
        {
            System.out.print("Enter a number = ");
            int num = sc.nextInt();
            if(num == -1)
            {
                return null;
            }
            Node newNode = new Node(num);
            newNode.left = buildTree(sc);
            newNode.right = buildTree(sc);
            //System.out.print(newNode.data+" : ");
            return newNode;
        }
        public void print(Node nodes)
        {
            if(nodes == null)
            {
                System.out.print("-1"+" ");
                return;
            }
            print(nodes.left);
            System.out.print(nodes.data+" ");
            print(nodes.right);
        }
    }
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        Scanner s = new Scanner(System.in);
        Node root = tree.buildTree(s);
        tree.print(root);
        System.out.println();
        System.out.print("Root Node = "+root.data);
    }
}

/*

Q)So when I write newNode.left = buildTree(sc); then does the new number which the user enters goes to the left
of the previous number ?
Ans) Yes, that’s correct! When the line newNode.left = buildTree(sc); is executed, the buildTree method is
called again with the same Scanner object as an argument. This causes the method to prompt the user to enter
another number. If the entered number is not -1, a new node is created with this number as its data and this
new node is assigned to the left field of the newNode object. This means that the new number entered by the
user becomes the data of the left child of the previous node. The same process is repeated for the right
child of the newNode object when the line newNode.right = buildTree(sc); is executed.

Q)But how does the code remembers that it has to assign the number to the left of the previous number ?
Ans) The code remembers to assign the new number to the left of the previous node because of the recursive
nature of the buildTree method. When the method is called for the first time, it creates a new node with the
first number entered by the user as its data. Then it calls itself again to build the left subtree of this node.
During this second call to the buildTree method, another number is read from the user and a new node is created
with this number as its data. This new node is returned by the second call to buildTree and assigned to the left
field of the first node. This process continues recursively, with each call to buildTree creating a new node
and assigning it as the left or right child of the previous node, depending on whether the method was called
to build the left or right subtree. In summary, it’s the recursive structure of the buildTree method that allows the code to remember where to assign each new number entered by the user.

The return newNode; statement gets executed in a depth-first order as the binary tree is being built by the
buildTree method. This means that the return newNode; statement gets executed first for the leftmost node in
the binary tree, then for its parent node, then for its right sibling (if it has one), and so on.
For example, let’s say the user enters the numbers 1, 2, -1, -1, 3, -1, -1, in that order. In this case, the
buildTree method will build a binary tree with 3 nodes: a root node with data 1, a left child with data 2, and
a right child with data 3. The return newNode; statement will be executed first for the leftmost node (the one
with data 2), then for its parent (the root node with data 1), and finally for its right sibling (the node with
data 3). So in this example, the order in which the return newNode; statement gets executed is: 2, 1, 3.
After the binary tree has been completely built and all the recursive calls to the buildTree method have
returned, the final call to the method returns the root of the binary tree. This root node is then stored in
the root variable by the statement Node root = tree.buildTree(s); in the main method.

Q)Is the return newNode statement executed after the whole tree has been built or after building of each node
of the tree ?
Ans) The return newNode; statement is executed after the creation of each node in the binary tree. Each time
the buildTree method is called, it creates a new node, assigns its left and right children by recursively
calling itself, and then returns this new node to the calling method by executing the return newNode; statement.
So, to answer your question, the return newNode; statement is executed after the creation of each node in the
binary tree, not just after the whole tree has been built.

Q)Is the return newNode statement executed after the building of whole tree has been complete ?
Ans) The return newNode; statement is executed each time a new node is created and its left and right subtrees
have been built. This means that the return newNode; statement is executed multiple times while the binary
tree is being built, once for each node in the tree.
After the whole tree has been built and all the recursive calls to the buildTree method have returned, the
final call to the method returns the root of the binary tree. This final return value is then stored in the
root variable by the statement Node root = tree.buildTree(s); in the main method.
So, to answer your question, the return newNode; statement is executed multiple times while the binary tree
is being built, once for each node in the tree. The final execution of this statement returns the root of the
binary tree after the whole tree has been built.


 */

/*
This was the original code written by me but it was not giving me the intended result

import java.util.Scanner;
public class chk
{
    static Scanner sc = new Scanner(System.in);
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
        public Node buildTree(int nodes)
        {
            if(nodes == -1)
            {
                return null;
            }
            Node newNode=new Node(nodes);
            System.out.print("Enter a number = ");
            int num = sc.nextInt();
            newNode.left=buildTree(num);
            newNode.right=buildTree(num);
            return newNode;
        }
        public void print(Node nodes)
        {
            if(nodes == null)
            {
                System.out.print("-1"+" ");
                return;
            }
            print(nodes.left);
            System.out.print(nodes.data+" ");
            print(nodes.right);
        }
    }
    public static void main(String[] args)
    {
        BinaryTree tree=new BinaryTree();
        System.out.print("Enter the root number = ");
        int n = sc.nextInt();
        Node root=tree.buildTree(n);
        tree.print(root);
        System.out.println(root.data);
    }
}

 */