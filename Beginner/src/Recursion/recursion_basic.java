package Recursion;
public class recursion_basic
{
    public static void reverse(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println("before call");
        System.out.println(n);
        reverse(n-1);
        System.out.println("after call = "+n);
        System.out.println(n);
    }
    public static void main(String[] args)
    {
        reverse(5);
    }
}
