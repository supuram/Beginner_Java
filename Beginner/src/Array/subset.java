package Array;
import java.util.Scanner;
public class subset {
    public static void main(String[] args) {
        int n, i,count=1,j;
        System.out.println("Enter the size of the array = ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " th array = ");
            arr[i] = sc.nextInt();
        }
        System.out.print("The array = ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        do
        {
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j+=count)
                {
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
            count=count+1;
        }while(count!=n);
    }
}
