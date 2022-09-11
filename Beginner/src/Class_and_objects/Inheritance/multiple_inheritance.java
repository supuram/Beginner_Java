package Class_and_objects.Inheritance;
public class multiple_inheritance
{
    public static void main(String[] args)
    {
        C1 obj=new C1();
        obj.set();
        obj.value();
    }
}
interface A
{
    void set();
}
interface B
{
    void value();
}
class C1 implements A,B   //this is multiple inheritance where C inherits the interfaces A and B
{
    public void set()
    {
        System.out.println("Value is 10");
    }
    public void value()
    {
        System.out.println("Value is very high");
    }
}
