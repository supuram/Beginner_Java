package Basic;
import java.util.*;
public class prime
{
    public static void main(String[] args)
    {
        int n,ct=0;
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter a number = ");
            n = sc.nextInt();
        }
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                ct=ct+1;
            }
        }
        if(ct==2)
        {
            System.out.println("Number is prime");
        }
    }
}
