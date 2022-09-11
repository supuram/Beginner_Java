package Recursion.Backtracking;
// Time Complexity is O(n*n!)
public class string_permutation
{
    public static void permutation(String str, String ans)
    {
        if(str.length()==0)
        {
            System.out.println("["+ans+"]");
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char curr=str.charAt(i);
            String Newstr=str.substring(0,i)+str.substring(i+1);
            //System.out.println("{"+Newstr+"}"+","+i+","+ans);
            permutation(Newstr,ans+curr);
            //System.out.println("("+Newstr+")"+","+i+","+ans);
        }
    }
    public static void main(String[] args)
    {
        String str="abc";
        permutation(str,"");
    }
}
