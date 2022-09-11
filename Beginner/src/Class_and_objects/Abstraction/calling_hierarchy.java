package Class_and_objects.Abstraction;
public class calling_hierarchy
{
    public static void main(String[] args)
    {
        C obj=new C();  /* first the constructor of the base class is called and then the next one in
        the hierarchy and the the next one  */
        System.out.println("Value of a from obj= "+obj.a);
        C obj1=new C(35);
        System.out.println("Value of a from obj1= "+obj1.a);
        System.out.println("Name = "+obj.name);
        B obj2=new B();
        System.out.println("Value of a from obj2= "+obj2.a);
    }
}
abstract class A
{
    String name;
    int a;
    A()
    {
        a=10;
        System.out.println("A constructor called");
    }
}
class B extends A
{
    B()
    {
        a=20;
        System.out.println("B constructor called");
    }
}
class C extends B
{
    C()
    {
        super.name="Arjun";  //with the use of super you can assign values to base class variables
        a=30;
        System.out.println("C constructor called");
    }
    C(int a)
    {
        this.a=a;
        System.out.println("Value of a = "+a);
    }
}