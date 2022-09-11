package Array;
import java.util.*;
import java.lang.*;
public class subarray_largestsum2
{
    public static void main(String[] args)
    {
        int n,i;
        System.out.println("*********************PREFIX SUM METHOD****************************");
        System.out.println("Enter the size of the array = ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        int[] prefixsum=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the "+(i+1)+" th array = ");
            arr[i]=sc.nextInt();
        }
        System.out.print("The original array =");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int max=Integer.MIN_VALUE,min=0;
        prefixsum[0]=arr[0];
        for(i=1;i<n;i++)
        {
            prefixsum[i]=prefixsum[i-1]+arr[i];
        }
        System.out.print("The prefix sum of the array = ");
        for(i=0;i<n;i++)
        {
            System.out.print(prefixsum[i]+" ");
        }
        System.out.println();
        for(i=0;i<n;i++)
        {
            max=Math.max(max,prefixsum[i]-min);
            min=Math.min(min,prefixsum[i]);
        }
        System.out.println("Largest Sum = "+max);
    }
}
