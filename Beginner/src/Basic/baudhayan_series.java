package Basic;
public class baudhayan_series
{
    public static void main(String[] args)
    {
           int i,a=0,b=1,c;
           for(i=1;i<=10;i++)
           {
               c=a+b;
               System.out.print(a+" ");
               a=b;
               b=c;
           }
    }
}
