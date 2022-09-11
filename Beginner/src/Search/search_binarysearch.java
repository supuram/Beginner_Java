package Search;
import java.util.*;
public class search_binarysearch
{
    public static void main(String[] args)
    {
        int n,i,j,swap;
        System.out.println("Enter the size of the array = ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the "+(i+1)+" th array = ");
            arr[i]=sc.nextInt();
        }
        System.out.println("The array = ");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
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
        System.out.println();
        System.out.println("Enter the number you want to search");
        int num=sc.nextInt();
        int start=0, end=n, mid;
        for(i=start;i<end;i++)
        {
            mid=(start+end)/2;
            if(arr[mid]>num)
            {
                end=mid;
                continue;
            }
            else if(arr[mid]<num)
            {
                start=mid;
                continue;
            }
            else if(arr[mid]==num)
            {
                System.out.println(num+" found at "+(mid+1)+" th position");
                break;
            }
        }
    }
}
