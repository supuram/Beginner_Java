package Array;
import java.util.*;
public class reversearray
{
    public static void main(String[] args)
    {
        int n,i;
        System.out.println("Enter the size of the array = ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the "+(i+1)+" th array = ");
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int swap;
        for(i=0;i<n/2;i++)
        {
            swap=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=swap;
        }
        System.out.print("The reverse array = ");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
