package Sort;
import java.util.*;
public class inbuiltsort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        int i;
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
        Arrays.sort(arr);
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The sorted array in reverse order = ");
        Arrays.sort(arr,Collections.reverseOrder()); /*Collections.reverseOrder() works with only
        Integer class and will not work with int as 'int' is a primitive data type but Integer is a class
        and arr is now an object of the Integer class. */
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
