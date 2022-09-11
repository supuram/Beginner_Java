package Class_and_objects;
public class copy_constructor_deepcopy
{
    public static void main(String[] args)
    {
        Pupil1 p=new Pupil1();
        p.name="supratik";
        p.roll=77;
        System.out.println("p="+p.name);
        System.out.println("p="+p.roll);
        p.marks[0]=88;
        p.marks[1]=90;
        Pupil1 obj=new Pupil1(p);  //copies properties of p to obj
        p.name="Ramayan";
        p.marks[1]=56;
        System.out.println("p="+p.name);
        System.out.println("copy constructor = "+obj.name);
        System.out.println("copy constructor = "+obj.roll);
        for(int i=0;i<2;i++)
        {
            System.out.println("copy constructor = " + obj.marks[i]);
        }
        for(int i=0;i<2;i++)
        {
            System.out.println("p = " + p.marks[i]);
        }
    }
}
class Pupil1
{
    String name;
    int roll;
    int[] marks;
    Pupil1()
    {
        marks=new int[2];    /*if you don't write this line there will be runtime error and it will show
        that p.marks is null  */
        name="hulu";
        roll=9;
    }
    Pupil1(Pupil1 p)  //deep copy constructor
    {
        marks=new int[2];   //without this line the code is showing runtime error
        this.name=p.name;
        this.roll=p.roll;
        this.marks[0]=p.marks[0];   //deep copy
        this.marks[1]=p.marks[1];   //deep copy
    }
}

