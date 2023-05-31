package Basic;

/* An example that demonstrates the differences between a static method and an instance method  */

public class MyClass {
    private int x;

    public MyClass(int x) {
        this.x = x;
    }

    public static void myStaticMethod() {
        System.out.println("This is a static method.");
    }

    public void myInstanceMethod() {
        System.out.println("This is an instance method. x = " + x);
    }

    public static void main(String[] args) {
        MyClass.myStaticMethod(); // calling the static method

        MyClass myObject = new MyClass(10);
        myObject.myInstanceMethod(); // calling the instance method
    }
}

/*  In this example, the MyClass class has a static method myStaticMethod and an instance method
myInstanceMethod. The static method can be called directly on the class using the syntax
MyClass.myStaticMethod(), while the instance method can only be called on an instance of the class
using the syntax myObject.myInstanceMethod().  */
