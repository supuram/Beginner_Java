package Recursion;
public class recursion_1st_occ
{
    static int occurence(int[] arr,int key,int i)
    {
        if(i==arr.length-1 && arr[i]!=key)
            return -1;
        if(arr[i]==key)
            return i+1;
        return occurence(arr,key,i+1);
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(occurence(arr,9,0));
    }
}
