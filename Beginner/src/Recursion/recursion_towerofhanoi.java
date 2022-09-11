package Recursion;
public class recursion_towerofhanoi
{
    public static void towerofhanoi(int n, String source, String helper, String dest)
    {
        if(n==1)
        {
            System.out.println("transfer disk "+n+" from "+source+" to "+dest);
            return;
        }
        towerofhanoi(n-1,source,dest,helper);
        System.out.println("transfer disk "+n+" from "+source+" to "+dest);
        towerofhanoi(n-1,helper,source,dest);
    }
    public static void main(String[] args)
    {
        int n=2;
        towerofhanoi(n,"S","H","D");
    }
}
