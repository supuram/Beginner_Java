package Greedy_Algorithms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
/*
You are given n activities with their start and end times. Select the maximum number of activities that can
be performed by a single person, assuming that the person can only work on a single activity at a time.
Activities are sorted according to end time.
start=[10,12,20]
end=[20,25,30]
ans= 2(A0 & A2)
Suppose a person performs A0 with start time of 10 and end time of 20. So by the time he finishes A0, he
cannot do A1 as start time of A1 is 12. But if he does A0, he can do A2 as its start time is 20. So maximum
number of activities is 2.
 */
public class Activity_Selection_after_sort
{
    public static void main(String[] args)
    {
        int[] start={1,3,0,5,8,5};
        int[] end={2,4,6,7,9,9};
        int[][] sorting=new int[start.length][3];
        for(int i=0;i<start.length;i++)
        {
            sorting[i][0]=i;
            sorting[i][1]=start[i];
            sorting[i][2]=end[i];
        }
        Arrays.sort(sorting, Comparator.comparingDouble(o->o[2]));
        /* Comparator.comparingDouble is a lambda function which means that it shortens any long
        operation. Here it shortens the sorting of 2D array operation and sorts according to column 2. */
        int max=1;
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(sorting[0][0]);
        int listend=sorting[0][2];
        for(int i=1;i<end.length;i++)
        {
            if(sorting[i][1]>=listend)
            {
                max++;
                arr.add(sorting[i][0]);
                listend=sorting[i][2];
            }
        }
        System.out.println(max);
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" ");
        }
    }
}
