package Class_and_objects;
public class box {
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
}