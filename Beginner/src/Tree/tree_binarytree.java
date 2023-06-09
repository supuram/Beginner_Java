package Tree;
public class tree_binarytree
{
    // https://www.youtube.com/watch?v=-DzowlcaUmE&t=2988s
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
                System.out.print("-1"+" ");
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            System.out.print("("+newNode.data+")");
            newNode.right=buildTree(nodes);
            System.out.print("["+newNode.data+"]");
            System.out.println();
            return newNode;
        }
    }
    public static void main(String[] args)
    {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(root.data);
    }
}

/*
The line Node newNode = new Node(nodes[idx]); is a Java statement that creates a new object of the Node class and
assigns it to a variable named newNode. Here’s an explanation of each term in this line:

Node: This is the name of a class. In this case, it’s likely a custom class defined elsewhere in the code. The Node
class defines the type of object that will be created and the behavior of that object.

newNode: This is the name of a variable. The variable is being declared with the type Node, which means it can hold a
reference to an object of the Node class. The variable is being assigned a value on the same line where it’s declared.
The object is created using the new keyword and the Node constructor, which is called with the argument nodes[idx].
The newly created object is then assigned to the newNode variable.

new: This is the new keyword, which is used to create a new instance of a class. When you use the new keyword followed
by a class name and parentheses, you’re calling the constructor of that class to create a new object.

Node(nodes[idx]): This is a call to the constructor of the Node class. The constructor is being passed one argument,
which is the value of the expression nodes[idx]. The constructor will use this argument to initialize the new Node
object in some way.
 */

/*
In Java, when you create an object using the new keyword, the object is stored in memory and a reference to the object
is returned. This reference is a value that points to the memory location where the object is stored. You can use this
reference to access and manipulate the object.

When you assign the reference to a variable (like in the line Node newNode = new Node(nodes[idx]);), the variable holds
a copy of the reference. This means that you can use the variable to access and manipulate the object it refers to.

Here’s an example that demonstrates how references to objects work:
class MyClass {
    int x;

    MyClass(int x) {
        this.x = x;
    }
}

MyClass myObject = new MyClass(10);
System.out.println(myObject.x); // 10

In this example, we define a class named MyClass with a single instance variable x and a constructor that takes an int
argument and assigns it to x. We then create a new instance of MyClass using the new keyword and pass it the argument
10. This creates a new MyClass object with its x instance variable set to 10.

The reference to the newly created object is returned by the new keyword and assigned to a variable named myObject.
This means that myObject holds a reference to the MyClass object. We can use this reference to access and manipulate
the object by calling methods on it or accessing its instance variables using the dot notation. In this case, we use
the dot notation to access the value of the x instance variable and print it to the console.

In summary, a reference to an object is a value that points to the memory location where the object is stored. You can
use this reference to access and manipulate the object by calling methods on it or accessing its properties.
 */