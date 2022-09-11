package Class_and_objects;
public class class_Oops
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
        BankAccount myAcc=new BankAccount();
        myAcc.username="sup";
        System.out.println(myAcc.username);
        //myAcc.password="kokok";  will show error as password cannot be accessed
        myAcc.setPassword("jhgjhgj");
        //myAcc.setAge(8);  since setAge() is private it cannot be accessed
    }
}
class BankAccount
{
    public String username;
    private String password;
    private int age;
    public void setPassword(String pwd)
    {
        password=pwd;
    }
    private void setAge(int a)
    {
        age=a;
    }
    public static void main(String[] args)  /*this function doesn't get executed. If you comment out the
    main function of the class_Oops class, then this main function gets executed */
    {
        BankAccount obj=new BankAccount();
        obj.setAge(8);
        obj.setPassword("hbshbbhfbhf");
        System.out.println(obj.age);
        System.out.println(obj.password);
    }
}
class Pen
{
    String colour;
    int tip;
    void setColour(String newColour)
    {
        colour=newColour;
    }
    void setTip(int newTip)
    {
        tip=newTip;
    }
}
class Student
{
    String name;
    int age;
    float percent;
    void calcPercent(int phy,int chem,int maths)
    {
        percent=(phy+chem+maths)/3;
    }
    void setName(String newName)
    {
        name=newName;
    }
    void setAge(int newAge)
    {
        age=newAge;
    }
}
