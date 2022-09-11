package Class_and_objects;
public class copy_constructor
{
    public static void main(String[] args)
    {
        Pupil p=new Pupil();
        Pupil pu=new Pupil();
        System.out.println("pu="+pu.name);
        System.out.println("pu="+pu.roll);
        p.name="supratik";
        p.roll=77;
        System.out.println("p="+p.name);
        System.out.println("p="+p.roll);
        Pupil p2=new Pupil("hanuman");
        System.out.println(p2.name);
        Pupil p3=new Pupil(55);
        System.out.println(p3.roll);

        p.marks[0]=88;
        p.marks[1]=90;
        Pupil obj=new Pupil(p);  //copies properties of p to obj
        p.name="Ramayan";
        p.marks[1]=56;
        System.out.println("p="+p.name);
        System.out.println("copy constructor = "+obj.name);
        System.out.println("copy constructor = "+obj.roll);
        obj.password="opopo";
        System.out.println(obj.password);
        for(int i=0;i<2;i++)
        {
            System.out.println("copy constructor = "+obj.marks[i]);
            /*  As you can see we first assigned p.marks[1]=90 and later we changed
        p.marks[1]=56 and the second change is reflected in the copy constructor. This is
        shallow copy. If we want that when we change p.marks[1], no change should be reflected in the
        copy constructor we have to go for deep copy. Shallow copy is not reflected for primitive
        data type. Primitive data always go for deep copy.  */
        }
    }
}
class Pupil
{
    String name;
    int roll;
    int[] marks;
    String password;
    Pupil()
    {
        marks=new int[2];    /*if you don't write this line there will be runtime error and it will show
        that p.marks is null  */
        name="hulu";
        roll=9;
    }
    Pupil(Pupil p)  //copy constructor
    {
        this.name=p.name;
        this.roll=p.roll;
        this.password=p.password;
        this.marks=p.marks;
    }
    Pupil(String name)
    {
        marks=new int[2];
        this.name=name;
    }
    Pupil(int roll)
    {
        marks=new int[2];
        this.roll=roll;
    }
}
