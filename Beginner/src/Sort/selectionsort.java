package Sort;
import java.util.*;
public class selectionsort
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i,j, swap, min;
        for (i = 0; i < n; i++)
        {
            System.out.println("Enter the " + (i + 1) + " th array = ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The original array = ");
        for (i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The sorted array = ");
        for(i=0;i<n;i++)
        {
            min=i;
            for(j=i+1;j<n;j++)
            {
                if(arr[min]>arr[j])
                {
                    min=j;
                }
            }
            swap=arr[i];
            arr[i]=arr[min];
            arr[min]=swap;
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
