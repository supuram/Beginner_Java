package Recursion;
public class staircase_problem
{
    static int staircase(int n)
    {
        if(n<0)
            return 0;
        if(n==0 || n==1)
            return 1;
        return staircase(n-1)+staircase(n-2)+staircase(n-3);
    }
    public static void main(String[] args)
    {
        System.out.println(staircase(4));
    }
}
