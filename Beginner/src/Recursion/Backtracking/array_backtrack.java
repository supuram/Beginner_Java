package Recursion.Backtracking;
public class array_backtrack
{
    public static void changeArr(int[] arr,int i, int val)
    {
        if(i==arr.length)
        {
            System.out.print("Base case array = ");
            printArr(arr);
            return;
        }
        arr[i]=val;
        changeArr(arr,i+1,val+1);
        System.out.println("Before = "+arr[i]+" , "+"i = "+i);
        arr[i]=arr[i]-2;
        System.out.println("After = "+arr[i]+" , "+"i = "+i);
    }
    public static void printArr(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int[] arr=new int[5];
        changeArr(arr,0,1);
        System.out.print("Final array = ");
        printArr(arr);
    }
}
