package Greedy_Algorithms;
import java.util.*;
/*
We are given an infinite supply of denominations of [1,2,5,10,20,50,100,200,500,1000,20000]. Find
minimum number of coins/notes to make change for a value V.
V = 121. Ans = 3 (100+20+1)
V = 590. Ans = 4 (500+50+20+20)
 */
public class Indian_Coins
{
    public static void main(String[] args)
    {
        Integer[] coins={1,2,5,10,20,50,100,200,500,1000,20000};
        Arrays.sort(coins,Comparator.reverseOrder());
        //To use reverseOrder() we need to use Integer class
        int amt=590;
        int ct=0;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<coins.length;i++)
        {
            if(coins[i] <= amt)
            {
                while(coins[i] <= amt)
                {
                    ct++;
                    ans.add(coins[i]);
                    amt = amt - coins[i];
                }
            }
        }
        System.out.println("Minimum coins used = "+ct);
        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }
    }
}
