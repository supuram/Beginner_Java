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

/*
Dry Run from Bing

1.	The first call to the array method is made with the arguments arr and arr.length (which is 5).
2.	Since n (5) is greater than 0, the method returns the value of arr[n-1] (which is 5) plus the result of
calling the array method again with the arguments arr and n-1 (which is 4).
3.	This second call to the array method returns the value of arr[n-1] (which is 4) plus the result of calling
the array method again with the arguments arr and n-1 (which is 3).
4.	This third call to the array method returns the value of arr[n-1] (which is 3) plus the result of calling
the array method again with the arguments arr and n-1 (which is 2).
5.	This fourth call to the array method returns the value of arr[n-1] (which is 2) plus the result of calling
the array method again with the arguments arr and n-1 (which is 1).
6.	This fifth call to the array method returns the value of arr[n-1] (which is 1) plus the result of calling
the array method again with the arguments arr and n-1 (which is 0).
7.	Since this sixth call to the array method has an argument of n=0, which is less than or equal to 0, it
returns 0.
8.	So working backwards, we can see that:
o	The fifth call to the method returns 1 + 0 = 1
o	The fourth call to the method returns 2 + 1 = 3
o	The third call to the method returns 3 + 3 = 6
o	The second call to the method returns 4 + 6 = 10
o	The first call to the method returns 5 + 10 = 15
So that’s how we get a final result of 15.

*/
