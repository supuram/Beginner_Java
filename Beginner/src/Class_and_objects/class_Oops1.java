package Class_and_objects;
public class class_Oops1
{
    public static void main(String[] args)
    {
        Pen p1=new Pen();
        p1.setColour("Green");
        System.out.println(p1.colour);
        p1.setTip(6);
        System.out.println(p1.tip);
        Student s=new Student();
        s.calcPercent(22,55,78);
        System.out.println(s.percent);
        s.setName("Supra");
        System.out.println(s.name);
        s.setAge(22);
        System.out.println(s.age);

        Car c=new Car();
        c.setColour("Red");
        System.out.println(c.getColour());
        c.setNumber(78788);
        System.out.println(c.getNumber());
    }
}
class Car
{
    private String colour;
    private int number;
    String getColour()
    {
        return this.colour;
    }
    int getNumber()
    {
        return this.number;
    }
    void setColour(String colour)
    {
        this.colour=colour;
    }
    void setNumber(int number)
    {
        this.number=number;
    }
}
