package Recursion;

public class recursion_baudhayan1
{
    static int i=0;
    static int baudhayan(int n)
    {
        if(n==0 || n==1) {
            return n;
        }
        int fnm1=baudhayan(n-1);
        int fnm2=baudhayan(n-2);
        i=i+1;
        return fnm1+fnm2;
        //return tiling(n-1)+tiling(n-2);
    }
    public static void main(String[] args)
    {
        System.out.println(baudhayan(5));
        System.out.println(i);
    }
}
