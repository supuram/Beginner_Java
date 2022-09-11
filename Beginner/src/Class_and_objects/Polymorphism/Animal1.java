package Class_and_objects.Polymorphism;
public class Animal1
{
    /* Parent and child classes contain the same function name which does different works. This
     is method overriding and is runtime polymorphism */
    void eat()
    {
        System.out.println("eats anything");
    }
    public static void main(String[] args)
    {
        Animal1 obj=new Animal1();
        obj.eat();
        Deer d=new Deer();
        d.eat();
        d.legs=4;
        System.out.println("Number of legs = "+d.legs);
        Animal1 obj1=new Deer();
        obj1.eat();
        //obj1.legs=4;   shows error
        //System.out.println("Number of legs = "+obj1.legs=3);  shows error
    }
}
class Deer extends Animal1
{
    int legs;
    void eat()
    {
        System.out.println("eats grass");
    }
}