package Class_and_objects;
public class box_withstatic_and_public_2
{
    double width, height, depth,vol;
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
    static void set_dim()   //global variables cannot be assigned inside static functions
    {
        //width=2.33;
        //height=3.44;
        //depth=4.98;
        int a=2;
        System.out.println(a);
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
    public void call()
    {
        box_withstatic_and_public_2 obj1= new box_withstatic_and_public_2();
        set_dim();
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
    public static void main(String[] args)
    {
        box_withstatic_and_public_2 obj2= new box_withstatic_and_public_2();
        obj2.call();
    }
}
