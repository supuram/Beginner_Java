package Recursion.Backtracking;
public class string_subset
{
    public static void subset(String str, String ans,int i)
    {
        if(i==str.length())
        {
            if(ans.length()==0)
                System.out.println("null");
            else
                System.out.println(ans+" "+i);
            return;
        }
        subset(str,ans+str.charAt(i),i+1);
        System.out.println("{"+ans+"}"+" "+i);
        subset(str,ans,i+1);
        System.out.println("["+ans+"]"+" "+i);
    }
    public static void main(String[] args)
    {
        String str="abc";
        subset(str,"",0);
    }
}
