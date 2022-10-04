package Greedy_Algorithms;
import java.util.Arrays;
/*
Minimum Absolute Difference Pairs
Given two arrays A and B of equal length n. Pair each element of array A to an element in array B, such that
sum of absolute differences of all the pairs is minimum.
A = [1,2,3]          B=[2,1,3]
Ans = 0
Case 1 - |1-2| + |2-2| + |3-2| = 2
Case 2 - |1-1| + |2-1| + |3-1| = 3
Case 3 - |1-3| + |2-3| + |3-3| = 3
Case 4 - |1-2| + |2-1| + |3-3| = 2
Case 5 - |1-1| + |2-2| + |3-3| = 0
Many more cases can be formed but Case 5 has the lowest sum
 */
public class min_abs_diff_pairs
{
    //This code will not give the perfect correct answer but the answer will be close to the perfect ans
    public static void main(String[] args)
    {
        int[] a={4,1,8,7};
        int[] b={2,3,6,5};
        //Answer should be |4-3| + |1-2| + |8-6| + |7-6| = 5
        Arrays.sort(a);
        Arrays.sort(b);
        int sum=0;
        for(int i=0;i<4;i++)
        {
            sum=sum+Math.abs(a[i]-b[i]);
        }
        System.out.print(sum);
    }
}
