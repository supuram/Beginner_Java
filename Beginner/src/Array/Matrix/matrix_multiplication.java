package Array.Matrix;
import java.util.*;
public class matrix_multiplication
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix");
        int row1=sc.nextInt();
        System.out.println("Enter the number of columns in the matrix");
        int col1=sc.nextInt();
        int[][] arr1=new int[row1][col1];
        int i,j,k;
        for(i=0;i<row1;i++)
        {
            for(j=0;j<col1;j++)
            {
                System.out.print("Enter the ("+i+","+j+")th element of the matrix = ");
                arr1[i][j]=sc.nextInt();
                System.out.println();
            }
        }
        System.out.println("Matrix 1 is");
        for(i=0;i<row1;i++)
        {
            for(j=0;j<col1;j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enter the number of rows in the matrix");
        int row2=sc.nextInt();
        System.out.println("Enter the number of columns in the matrix");
        int col2=sc.nextInt();
        int[][] arr2=new int[row2][col2];
        for(i=0;i<row2;i++)
        {
            for(j=0;j<col2;j++)
            {
                System.out.print("Enter the ("+i+","+j+")th element of the matrix = ");
                arr2[i][j]=sc.nextInt();
                System.out.println();
            }
        }
        System.out.println("Matrix 2 is");
        for(i=0;i<row2;i++)
        {
            for(j=0;j<col2;j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        int sum;
        System.out.println("Result of matrix multiplication = ");
        for(i=0;i<row1;i++)
        {
            for(j=0;j<col2;j++)
            {
                sum=0;
                for(k=0;k<col1;k++)
                {
                    sum=sum+(arr1[i][k]*arr2[k][j]);
                }
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
