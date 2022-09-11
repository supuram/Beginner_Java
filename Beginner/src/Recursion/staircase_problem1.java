package Recursion;
public class staircase_problem1
{
    static int i=0;
    static void staircase(int n)
    {
        if(n<0) {
            i=i+1;
            System.out.println(n+" ");
            return;
        }
        if(n==0 || n==1) {
            i=i+1;
            System.out.println("["+n+"]");
            return;
        }
        staircase(n-1);
        i=i+1;
        System.out.print("("+n+")"+" ");
        staircase(n-2);
        i=i+1;
        System.out.print("{"+n+"}"+" ");
        staircase(n-3);
        i=i+1;
        System.out.print("'"+n+"'"+" ");
    }
    public static void main(String[] args)
    {
        staircase(5);
        System.out.println();
        System.out.println("Total number of iteration = "+i);
    }
}
