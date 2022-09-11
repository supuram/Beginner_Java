package Class_and_objects;
public class box_constructor_demo
{
    public static void main(String[] args)
    {
        box_constructor mybox = new box_constructor(2.5, 5.7, 9.2);
        box_constructor mybox1 = new box_constructor(3.7, 8.99, 5.678);
        box_constructor mybox3=new box_constructor();
        box_constructor mybox4=new box_constructor();
        double vol;
        vol = mybox.volume();
        System.out.println("Volume = " + vol);
        vol = mybox1.volume();
        System.out.println("Volume = " + vol);
        mybox3.height=2;
        mybox3.width=3;
        mybox3.depth=4;
        //mybox3.x=8;
        vol=mybox3.volume();
        System.out.println("Volume = " + vol);
        vol=mybox4.volume();
        System.out.println("Volume = " + vol);
    }
}
