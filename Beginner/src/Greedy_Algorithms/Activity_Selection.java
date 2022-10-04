package Greedy_Algorithms;
import java.util.ArrayList;
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
public class Activity_Selection
{
    public static void main(String[] args)
    {
        int[] start={1,3,0,5,8,5};
        int[] end={2,4,6,7,9,9};
        int max=1;
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(0);
        int listend=end[0];
        for(int i=1;i<end.length;i++)
        {
            if(start[i]>=listend)
            {
                max++;
                arr.add(i);
                listend=end[i];
            }
        }
        System.out.println(max);
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" ");
        }
    }
}
