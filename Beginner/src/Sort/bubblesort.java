package Sort;
import java.util.*;
public class bubblesort
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i,j,swap;
        for (i=0;i<n;i++)
        {
            System.out.println("Enter the "+(i+1)+" th array = ");
            arr[i]=sc.nextInt();
        }
        System.out.println("The original array = ");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<(n-i-1);j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }
        }
        System.out.println();
        System.out.println("The sorted array = ");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
