package Basic;
import java.util.Scanner;
public class typecasting_5 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a float number = ");
        float f=sc.nextFloat();
        System.out.println("Enter an integer number = ");
        int i=sc.nextInt();
        float sum=f+i;
        System.out.println(sum);
        System.out.println("*******************************************");
        int s=(int)f+i;
        System.out.println(s);
        System.out.println("*******************************************");
        char ch='a';
        int n=ch;
        System.out.println(n);
        char ch1='c';
        int n1=ch1;
        System.out.println(n1);
        int ss=n+n1;
        System.out.println(ss);
        System.out.println("*******************************************");
        byte b=10;
        b=(int)2*10;  /*without writing (int) here it will show error as java has automatically
        converted 2*10 to integer type. Java automatically converts short, char and byte to integer
        type in an expression. Java converts int,float, long double to double in an expression. */
        System.out.println("Value of b = "+b);
        int $=24;
        System.out.println($);
    }
}