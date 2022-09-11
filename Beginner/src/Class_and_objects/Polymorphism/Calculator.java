package Class_and_objects.Polymorphism;
public class Calculator
{
    /* Multiple function with same name but different parameters is called function overloading. This
    is compile time polymorphism */
    int sum(int a,int b)
    {
        return a+b;
    }
    float sum(float a, float b)
    {
        return a+b;
    }
    int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    public static void main(String[] args)
    {
        Calculator obj=new Calculator();
        System.out.println(obj.sum(2,4));
        System.out.println(obj.sum(2.2f,8.3f));
        System.out.println(obj.sum(3,5,6));
    }
}
