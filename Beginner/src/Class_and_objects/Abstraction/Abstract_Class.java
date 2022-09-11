package Class_and_objects.Abstraction;
public class Abstract_Class
{
    public static void main(String[] args)
    {
        horse h=new horse();
        h.eat();
        h.walk();
        System.out.println(h.colour);
        h.changeColour();
        System.out.println(h.colour);
        chicken c=new chicken();
        c.eat();
        c.walk();
        System.out.println(c.colour);
        c.changeColour();
        System.out.println(c.colour);
    }
}
abstract class Animal2  //You cannot create objects of abstract classes
{
    String colour;
    Animal2()
    {
        colour="brown";
    }
    void eat()
    {
        System.out.println("eats");
    }
    abstract void walk();  /* implementation of abstract functions is there in subclasses of that
    particular class in which the abstract function is written */
}
class horse extends Animal2
{
    void changeColour()
    {
        colour="dark brown";
    }
    void walk()
    {
        System.out.println("walks on four legs");
    }
}
class chicken extends Animal2
{
    void changeColour()
    {
        colour="white";
    }
    void walk()
    {
        System.out.println("walks on two legs");
    }
}