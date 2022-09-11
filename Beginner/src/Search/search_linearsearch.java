package Search;
import java.util.*;
public class search_linearsearch {
    public static void main(String[] args)
    {
        int n,i;
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
        System.out.println("Enter the number you want to search");
        int num=sc.nextInt();
        int ct=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]==num)
            {
                ct++;
            }
        }
        System.out.println(num+" has been found "+ct+" times");
    }
}