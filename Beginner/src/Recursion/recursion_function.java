package Recursion;
public class recursion_function
{
    public static void conquer(int si, int mid, int ei,int a)
    {
        ++a;
        System.out.print("["+si+","+mid+","+ei+","+a+"], ");
    }
    public static void divide(int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int a=9;
        int mid =(si+ei)/2;
        divide(si,mid);
        System.out.print("("+si+","+mid+"), ");
        divide(mid+1,ei);
        //System.out.print("("+si+","+mid+"), ");
        System.out.print("("+(mid+1)+","+ei+"), ");
        conquer(si,mid,ei,a);
        System.out.print("("+a+"), ");
    }
    public static void main(String[] args)
    {
        int a=0,b=8;
        divide(a,b);
    }
}
