import java.util.*;
import java.lang.*;
public class trappingrain3
{
    public static void trap(int[] arr, int n) {
        int i, sum = 0;
        int[] leftmax = new int[n];
        int[] rightmax = new int[n];
        leftmax[0] = arr[0];
        for (i = 1; i < n; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], arr[i]);
        }
        rightmax[n - 1] = arr[n - 1];
        for (i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], arr[i]);
        }
        for (i = 0; i < n; i++) {
            sum = sum + (Math.min(leftmax[i], rightmax[i]) - arr[i]);
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
