package Basic;
import java.util.Scanner;
public class functions_7 {
    public static void name(String name)
    {
        int i;
        for(i=1;i<100;i++)
        {
            System.out.println(name);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a name = ");
        String str=sc.nextLine();
        name(str);
    }
}
