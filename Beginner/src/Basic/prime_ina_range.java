package Basic;
import java.util.*;
public class prime_ina_range
{
    public static void prime(int n)
    {
        int ct=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                ct=ct+1;
            }
        }
        if(ct==2)
        {
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args)
    {
        int n;
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter a range = ");
            n = sc.nextInt();
        }
        for(int i=1;i<=n;i++)
        {
            prime(i);
        }
    }
}
