package Loops;
import java.util.*;
public class pattern_hollowrectangle
{
    public static void main(String[] args)
    {
        int row,column;
        try(Scanner sc=new Scanner(System.in))
        {
            System.out.println("Enter the number of rows you want = ");
            row=sc.nextInt();
            System.out.println("Enter the number of columns you want = ");
            column=sc.nextInt();
        }
        int i,j;
        for(i=1;i<=row;i++)
        {
            for(j=1;j<=column;j++)
            {
                if(i==1 || i==row || j==1 || j==column)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
