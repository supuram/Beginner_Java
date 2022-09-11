package Array.Matrix;
import java.util.*;
public class matrix_spiralorder
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns in the matrix");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        int i, j;
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print("Enter the (" + i + "," + j + ")th element of the matrix = ");
                arr[i][j] = sc.nextInt();
                System.out.println();
            }
        }
        System.out.println("Matrix in normal order is");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix in spiral order is");
        int rstart=0,rend=row-1,cstart=0,cend=col-1,c,r;
        while(rstart<=rend && cstart<=cend)
        {
            if(rstart<=rend && cstart<=cend)
            {
                for(c=cstart;c<=cend;c++)
                {
                    System.out.print(arr[rstart][c]+" ");
                }
            }
            rstart++;
            if(rstart<=rend && cstart<=cend)
            {
                for(r=rstart;r<=rend;r++)
                {
                    System.out.print(arr[r][cend]+" ");
                }
            }
            cend--;
            if(rstart<=rend && cstart<=cend)
            {
                for(c=cend;c>=cstart;c--)
                {
                    System.out.print(arr[rend][c]+" ");
                }
            }
            rend--;
            if(rstart<=rend && cstart<=cend)
            {
                for(r=rend;r>=rstart;r--)
                {
                    System.out.print(arr[r][cstart]+" ");
                }
            }
            cstart++;
        }
    }
}