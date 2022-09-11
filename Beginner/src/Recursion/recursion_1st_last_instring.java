package Recursion;
public class recursion_1st_last_instring
{
    public static int first=-1;
    public static int last=-1;
    public static void occurence(String s,int idx,char ele)
    {
        if(idx==s.length())
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curr=s.charAt(idx);
        if(curr==ele)
        {
            if(first==-1)
            {
                first=idx;
            }
            else
            {
                last=idx;
            }
        }
        occurence(s,idx+1,ele);
    }
    public static void main(String[] args)
    {
        String str="abbcaadea";
        occurence(str,0,'a');
    }
}
