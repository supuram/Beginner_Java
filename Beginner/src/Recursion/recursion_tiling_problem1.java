package Recursion;
//A code to understand the recursion in the tiling problem
public class recursion_tiling_problem1
{
    static int i=0;
    static void tiling(int n)
    {
        if(n==0 || n==1) {
            i=i+1;
            System.out.println("["+n+"]");
            return;
        }
        //System.out.print("{"+n+"}"+" ");
        tiling(n-1);
        i=i+1;
        System.out.print("("+n+")"+" ");
        tiling(n-2);
        i=i+1;
        System.out.print("{"+n+"}"+" ");
    }
    public static void main(String[] args)
    {
        tiling(4);
        System.out.println();
        System.out.println("Total number of iteration = "+i);
    }
}
