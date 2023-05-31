package Recursion;
public class recursion_last_occ
{
    static int last_occurence(int[] arr,int key,int i,int last)
    {
        if(i!=arr.length)
        {
            if(i==arr.length-1 && last==-1)
                return -1;
            if(arr[i]==key)
            {
                last=i+1;
            }
            return last_occurence(arr,key,i+1,last);
        }
        return last;
    }
    public static void main(String[] args)
    {
        int[] arr={1,8,3,4,8,6,3,8,8};
        System.out.println(last_occurence(arr,3,0,-1));
    }
}
