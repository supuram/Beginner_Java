package Recursion;
public class recursion_baudhayan
{
    public static int baudhayan(int n,int a,int b)
    {
        if(n==0)
        {
            return a;
        }
        System.out.println(a);
        return baudhayan(n-1,b,a+b);
    }
    public static void main(String[] args)
    {
        System.out.println(baudhayan(9,0,1));
    }
}
