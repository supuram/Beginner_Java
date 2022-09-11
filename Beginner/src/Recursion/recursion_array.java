package Recursion;
public class recursion_array {
    public static int array(int[] arr,int n)
    {
        if(n<=0)
        {
            return 0;
        }
        System.out.print(arr[n-1]+" ");
        return arr[n-1]+array(arr,n-1);
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        System.out.print(array(arr,arr.length));
    }
}
