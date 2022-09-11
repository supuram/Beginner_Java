package Array;
import java.util.*;
import java.lang.*;
public class subarray_largestsum3
{
    public static void Kadane(int[] arr,int n)
    {
        int curr_sum=0,max_sum=Integer.MIN_VALUE,i;
        for(i=0;i<n;i++)
        {
            curr_sum=curr_sum+arr[i];
            if(curr_sum<0)
            {
                curr_sum=0;
            }
            if(curr_sum>max_sum)
            {
                max_sum=curr_sum;
            }
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