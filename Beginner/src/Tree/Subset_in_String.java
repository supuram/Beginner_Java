package Tree;

public class Subset_in_String
{
    static void subset(String str, String ans, int i)
    {
        if(i == str.length())
        {
            if(ans.length() == 0)
            {
                System.out.println("null");
            }
            else
            {
                System.out.print(ans+",");
            }
            return;
        }
        subset(str,ans+str.charAt(i),i+1);
        subset(str,ans,i+1);
    }
    public static void main(String[] args)
    {
        String str = "abc";
        subset(str," ",0);
    }
}
