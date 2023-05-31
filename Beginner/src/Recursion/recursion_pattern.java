package Recursion;
public class recursion_pattern
{
    public static void pattern(int n,int f,boolean b)
    {
        if(n>0 && b) {  //n>0 && b is a short form of n>0 && b==true
            //System.out.print(n+" ");
            pattern(n - 5, f, true);
            System.out.print("("+n+")"+" ");
        }
        else if(n<=0 && b) {
            //System.out.print(n+" ");
            pattern(n + 5, f, false);
            System.out.print("["+n+"]"+" ");
        }
        else if(n > 0 && n <= f) {
            //System.out.print(n+" ");
            pattern(n + 5, f, false);
            System.out.print("{"+n+"}"+" ");
        }
    }
    public static void main(String[] args)
    {
        pattern(21,21,true);
    }
}
