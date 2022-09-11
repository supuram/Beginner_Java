package Array;
import java.util.*;
public class subarray_largestsum1
{
    public static void main(String[] args)
    {
        int n,i,j,k;
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
        int max=Integer.MIN_VALUE,sum;
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                sum=0;
                for(k=i;k<=j;k++)
                {
                    sum=sum+arr[k];
                }
                if(sum>max)
                {
                    max=sum;
                }
            }
        }
        System.out.println("The largest sum = "+max);
    }
}
