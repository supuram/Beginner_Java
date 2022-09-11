package Loops;
import java.util.*;
public class pattern_halfpyramid
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
        int avg=1+((row+column)/2);
        if(row==column)
        {
            for (i = 1; i <= row; i++)
            {
                for (j = 1; j <= column; j++)
                {
                    if ((i + j) >= avg)
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
        else
        {
            System.out.println("Perfect pyramid is not possible");
        }
    }
}
