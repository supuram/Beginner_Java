package Class_and_objects;
public class boxDemo
{
    public static void main(String[] args)
    {
        box mybox=new box();
        box mybox1=new box();
        double vol;
        mybox.setdim(10.6,20.9,13.3);
        mybox1.setdim(3.4,6.77,9.888);
        vol=mybox.volume();
        System.out.println("Volume = "+vol);
        vol=mybox1.volume();
        System.out.println("Volume = "+vol);
        //setdim(2.2,3.4,7.99);
    }
}
