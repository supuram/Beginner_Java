package Search;
import java.util.Scanner;
import java.util.Arrays;
public class array_binarysrh
{
    public static void binarysearch(int[] arr, int srh)
    {
        //Time complexity for binary search is O(log n with base 2), where n is the length of the array
        int start=0,end=arr.length;
        int mid=(start+end)/2;
        while(srh!=arr[mid])
        {
            mid=(start+end)/2;
            if(srh>arr[mid])
            {
                start=mid;
            }
            else if(srh<arr[mid])
            {
                end=mid;
            }
            else {
                System.out.println(srh+" found at "+(mid+1)+" th index");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array = ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter the "+(i+1)+" th number = ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number you want to search in the array");
        int srh=sc.nextInt();
        Arrays.sort(arr);
        System.out.println("The sorted array is ");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        binarysearch(arr,srh);
    }
}

