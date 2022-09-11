package Basic;
import java.util.*;
public class reverseanumber
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number of digits you want in your number = ");
        Scanner sc=new Scanner(System.in);
        int digit=sc.nextInt();
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int i,rem;
        for(i=1;i<=digit;i++)
        {
            rem=num%10;
            System.out.print(rem);
            num=num/10;
        }
    }
}
