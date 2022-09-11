package Array.Matrix;
import java.util.*;
public class matrix_search
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
        int[] arr_row=new int[col];
        int[] arr_col=new int[row];
        for(i=0;i<row;i++)
        {
            int ct=0;
            for(j=0;j<col;j++)
            {
                arr_row[ct]=arr[i][j];
                ct=ct+1;
            }
            Arrays.sort(arr_row);
            ct=0;
            for(j=0;j<col;j++)
            {
                arr[i][j]=arr_row[ct];
                ct=ct+1;
            }
        }
        for(i=0;i<col;i++)
        {
            int ct=0;
            for(j=0;j<row;j++)
            {
                arr_col[ct]=arr[j][i];
                ct=ct+1;
            }
            Arrays.sort(arr_col);
            ct=0;
            for(j=0;j<row;j++)
            {
                arr[j][i]=arr_col[ct];
                ct=ct+1;
            }
        }
        System.out.println("The sorted array is ");
        for (i = 0; i < row; i++)
        {
            for (j = 0; j < col; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the number you want to search in the array = ");
        int srh= sc.nextInt();
        int r=0,c=col-1;
        while(srh!=arr[r][c])
        {
            if(srh>arr[r][c])
            {
                r=r+1;
            }
            else if(srh<arr[r][c])
            {
                c=c-1;
            }
        }
        System.out.println(srh+" found at = "+(r+1)+","+(c+1));
    }
}
