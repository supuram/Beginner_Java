package Class_and_objects;
public class box_constructor
{
    double width, height, depth;
    box_constructor(double w,double h,double d)   //this is a constructor of class box_constructor
    {
        width=w;
        height=h;
        depth=d;
    }
    box_constructor()
    {
        width=1;
        height=1;
        depth=1;
        //int x=9;
    }
    double volume()
    {
        return width* height* depth;
    }
}
