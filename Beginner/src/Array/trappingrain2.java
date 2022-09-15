import java.util.*;
import java.lang.*;
public class trappingrain2
{
    public static void trap(int[] arr, int n)
    {
        int i,j,leftmax,rightmax,sum=0;
        for(i=1;i<(n-1);i++)
        {
            leftmax=arr[i];
            for(j=0;j<i;j++)
            {
                leftmax=Math.max(leftmax,arr[j]);
            }
            rightmax=arr[i];
            for(j=i+1;j<n;j++)
            {
                rightmax=Math.max(rightmax,arr[j]);
            }
            sum=sum+(Math.min(leftmax,rightmax)-arr[i]);
        }
        System.out.println("Maximum trapped rainwater = "+sum);
    }
    public static void main(String[] args)
    {
        int n, i;
        System.out.println("Enter the size of the array = ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + " th array = ");
            arr[i] = sc.nextInt();
            System.out.println();
        }
        System.out.print("The user input array = ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        trap(arr,n);
    }
}
