package Class_and_objects.Inheritance;
public class Animals   //Animals is the base class
{
    String colour;
    void eat()
    {
        System.out.println("eats");
    }
    void breathes()
    {
        System.out.println("breathes");
    }
    public static void main(String[] args)
    {
        Animals tiger=new Animals();
        Fish shark=new Fish();
        RuiMach rui=new RuiMach();
        shark.eat();
        shark.breathes();
        shark.swim();
        System.out.println(shark.fins=20);
        tiger.eat();
        System.out.println(tiger.colour="Yellow");
        //tiger.swim();      shows error

        rui.eat();
        rui.breathes();
        rui.swim();
        rui.cook();
        rui.taste="Very Good";
        System.out.println(rui.taste);
        System.out.println(rui.fins=99);

        //shark.cook();        shows error
    }
}
class Fish extends Animals   //Fish is the derived class/Subclass
{
    int fins;
    void swim()
    {
        System.out.println("swims in water");
    }
}
class RuiMach extends Fish
{
    String taste;
    void cook()
    {
        System.out.println("cooked rui is good");
    }
}
