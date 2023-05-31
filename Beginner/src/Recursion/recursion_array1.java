package Recursion;
public class recursion_array1
{
    static int sum=0;
    public static void array(int[] arr,int n)
    {
        if(n<=0)
        {
            return;
        }
        sum=sum+arr[n-1];
        array(arr,n-1);
        System.out.println(n+" "+sum+" "+arr[n-1]);
        sum=sum+arr[n-1];
        System.out.println(sum);
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        array(arr,arr.length);
    }
}
