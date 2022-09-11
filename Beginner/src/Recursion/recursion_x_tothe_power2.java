package Recursion;
/* This is an optimized code with time complexity of O(log n with base 2) */
public class recursion_x_tothe_power2
{
    static int optimized(int x,int n)
    {
        if(n==0)
            return 1;
        int h=optimized(x, n / 2);
        int hSq=h*h;
        if(n%2!=0)
            hSq=x*hSq;
        return hSq;
    }
    public static void main(String[] args)
    {
        int x=2,n=10;
        System.out.println(optimized(x,n));
    }
}
