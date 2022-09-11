package Recursion;
/* This is an optimized code with time complexity of O(n). To make it an optimized code with time
complexity O(log n with base 2) see the next code  */
public class recursion_x_tothe_power1
{
    static int optimized(int x,int n)
    {
        if(n==0)
            return 1;
        if(n%2!=0)
            return x*optimized(x,n/2)*optimized(x,n/2);
        return optimized(x,n/2)*optimized(x,n/2);
    }
    public static void main(String[] args)
    {
        int x=2,n=20;
        System.out.println(optimized(x,n));
    }
}
