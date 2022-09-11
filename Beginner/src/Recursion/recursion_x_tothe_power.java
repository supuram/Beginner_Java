package Recursion;
// Time complexity is O(n)
public class recursion_x_tothe_power
{
    static int power(int x, int n)
    {
        if(n==0)
            return 1;
        return x*power(x,n-1);
    }
    public static void main(String[] args)
    {
        int x=9,n=2;
        System.out.println(power(x,n));
    }
}
