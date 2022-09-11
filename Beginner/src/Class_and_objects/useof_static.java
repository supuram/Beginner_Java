package Class_and_objects;
public class useof_static
{
    public static void main(String[] args)
    {
        Student1 s1=new Student1();
        s1.setName("mriganko");
        System.out.println(s1.getName());
        s1.schoolName="PVM";
        //Student1.schoolName="BSF";   this is a better way to call static variables
        Student1 s2=new Student1();
        System.out.println(s2.schoolName);  /*as schoolName is static it gets allocated to all objects of
         Student1. So even though schoolName is not allocated to s2 but is allocated to s1, s2 still
         is able to print the value of schoolName as schoolName is static and is already defined
         by s1  */
    }
}
class Student1
{
    String name;
    static String schoolName;
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return name;
    }
}

