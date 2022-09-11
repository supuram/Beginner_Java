package Basic;
import java.util.*;
import java.lang.Math;
public class decimaltobinary
{
    public static void main(String[] args)
    {
        int binary=0, decimal, rem,p=0;
        try (Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter a decimal number= ");
            decimal = sc.nextInt();
        }
        while(decimal!=0)
        {
            rem=decimal%2;
            binary=binary+rem*(int)Math.pow(10,p);
            p++;
            decimal=decimal/2;
        }
        System.out.println("The binary number = "+binary);
    }
}