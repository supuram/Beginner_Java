package Loops;
import java.util.Scanner;
public class pattern_butterfly {
    public static void main(String[] args) {
        int row, column;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows you want in a half pyramid = ");
            row = sc.nextInt();
            System.out.println("Enter the number of columns you want in a half pyramid = ");
            column = sc.nextInt();
        }
        int i, j;
        int sum = row + column + 1;
        int avg=1+((row+column)/2);
        if (row == column)
        {
            for (i = 1; i <= row; i++)
            {
                for (j = 1; j <= 2*column; j++)
                {
                    if ((i + j) >= sum || j <= i)
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
            for (i = avg; i <= 2*row; i++)
            {
                for (j = 1; j <= 2*column; j++)
                {
                    if ((i + j) <= sum || j >= i)
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
            System.out.print("butterfly not possible");
        }
    }
}