package Class_and_objects;
public class box_withstatic_and_public
{
    double width, height, depth;
    double volume()
    {
        return width* height* depth;
    }
    void setdim(double w,double h, double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    /*static void set_dim()
    {
        //global variables cannot be assigned inside static functions
        width=2.33;
        height=3.44;
        depth=4.98;
    }*/
    /*static void setdim_static(double w,double h,double d)
    {
        //global variables cannot be assigned inside static functions
        width=w;
        height=h;
        depth=d;
    }*/
    static void call_static()
    {
        System.out.println("This is a static method and no objects are needed to call it");
    }
    void setdim_void()
    {
        width=2.33;
        height=3.44;
        depth=4.98;
    }
    public void newsetdim(double w,double h, double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    public static void main(String[] args)
    {
        double vol;
        box_withstatic_and_public obj1= new box_withstatic_and_public();
        //set_dim();
        call_static();  //static methods can be called without using objects or even by using objects
        obj1.call_static();
        obj1.setdim_void();
        vol=obj1.volume();
        System.out.println("Volume for setdim_void = "+vol);
        obj1.setdim(2.33,5.77,9.87);
        vol=obj1.volume();
        System.out.println("Volume for setdim = "+vol);
        obj1.newsetdim(3.4,5.6,7.222);
        vol=obj1.volume();
        System.out.println("Volume for newsetdim = "+vol);

    }
}
