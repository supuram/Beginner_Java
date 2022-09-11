package Array;
import java.util.*;
import java.lang.*;
public class subarray_largestsum4
{
    public static void Kadane(int[] arr,int n)
    {
        /*This program also handles negative arrays unlike the previous one- subarray_largestsum3*/
        int curr_sum=arr[0],max_sum=arr[0],i;
        for(i=1;i<n;i++)
        {
            curr_sum=Math.max(curr_sum,curr_sum+arr[i]);
            max_sum=Math.max(max_sum,curr_sum);
        }
        System.out.println("Max sum = "+max_sum);
    }
    public static void main(String[] args)
    {
        int n,i;
        System.out.println("*********************KADANE'S ALGORITHM****************************");
        System.out.println("Enter the size of the array = ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
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
        Kadane(arr,n);
    }
}