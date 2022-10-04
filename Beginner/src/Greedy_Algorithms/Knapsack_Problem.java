package Greedy_Algorithms;
import java.util.Comparator;
import java.util.Arrays;
/*
Given the weights and values (i.e profit by selling one such item) of N items, put these items in a
knapsack of capacity W to get the maximum total value in the knapsack.
value = [60, 100, 120]
weight = [10, 20, 30]
W = 50
Ans = 240
 */
public class Knapsack_Problem
{
    public static void main(String[] args)
    {
        int[] val={60, 100, 120};
        int[] weight={10, 20, 30};
        int w=50;
        double[][] ratio=new double[val.length][2];
        for(int i=0;i<val.length;i++)
        {
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)weight[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        int capacity=w, res=0;
        for(int i=val.length-1;i>=0;i--)
        {
            int idx=(int)ratio[i][0];
            if(capacity>=weight[idx])
            {
                res=res+val[idx];
                capacity=capacity-weight[idx];
            }
            else
            {
                res=res+(int)(ratio[i][1]*capacity);
                break;
            }
        }
        System.out.print(res);
    }
}
