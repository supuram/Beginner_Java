import java.util.*;
import java.lang.*;
public class trappingrain
{
    public static void trap(int[] arr, int n)
    {
        /*THIS CODE HAS A LOT OF BUG WHICH WILL GIVE CORRECT ANSWER WITH A PARTICULAR SET AND WRONG
        ANSWER WITH ANOTHER SET. THE CORRECT CODE WILL BE WRITTEN IN trappingrain2*/
        int i,max=Integer.MIN_VALUE, index=0,secmax1=Integer.MIN_VALUE,secmax2=Integer.MIN_VALUE;
        int sum1=0,sum2=0,result;
        for(i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                index=i;
            }
        }
        System.out.println("Highest number = "+max);
        for(i=0;i<(index-1);i++)
        {
            if(arr[i]>=secmax1)
            {
                secmax1=arr[i];
            }
        }
        System.out.println("Second highest number = "+secmax1);
        for(i=(index+1);i<n;i++)
        {
            if(arr[i]>=secmax2)
            {
                secmax2=arr[i];
            }
        }
        System.out.println("Second highest number = "+secmax2);
        for(i=0;i<=(index-1);i++)
        {
            if(arr[index-1]==secmax1)
            {
                break;
            }
            sum1=sum1+(secmax1-arr[i]);
        }
        System.out.println("Sum1 = "+sum1);
        for(i=(index+1);i<n;i++)
        {
            if(arr[index+1]==secmax2)
            {
                break;
            }
            sum2=sum2+(secmax2-arr[i]);
        }
        System.out.println("Sum2 = "+sum2);
        result=sum1+sum2;
        System.out.println("Maximum rainwater = "+result);
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
