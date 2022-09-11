package Basic;
import java.util.*;
import java.lang.Math;
public class binary_to_decimal
{
    public static void main(String[] args)
    {
        int binary,ct=1,i,rem,decimal=0,num;
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter a binary number= ");
            binary = sc.nextInt();
            num=binary;
            while ((num / 10) != 0) {
                ct = ct + 1;
                num = num / 10;
                System.out.println("The binary value = " + num);
            }
            System.out.println("Total number of digits in the binary number = " + ct);
            for (i = ct; i >= 1; i--)
            {
                int p = ct - i;
                rem = binary % 10;
                System.out.println("The remainder value = " + rem + " " + i);
                decimal = decimal + rem * (int) (Math.pow(2, p));
                //System.out.println("The decimal value = "+decimal+" "+i);
                binary = binary / 10;
                //System.out.println("The binary value = "+binary+" "+i);
            }
            System.out.println("The decimal value = " + decimal);
        }
    }
}
