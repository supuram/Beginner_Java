package Basic;
import java.util.Scanner;
public class userinput_3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd number");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.print("The sum = ");
        System.out.println(sum);
        System.out.println("Enter a string = ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(str);
        boolean bool=input.nextBoolean();
        System.out.println(bool);
        System.out.println("Enter an integer");
        boolean a1=sc.hasNextInt();
        System.out.println(a1);
    }
}
