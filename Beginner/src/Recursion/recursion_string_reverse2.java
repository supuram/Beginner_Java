package Recursion;
public class recursion_string_reverse2
{
    public static String reverse(String s)
    {
        int len=s.length();
        if(s.length()==1)
        {
            return s;
        }
        System.out.println(len+" "+s+"  "+s.charAt(0));
        //return reverse(s.substring(1,len))+s.charAt(0);
        return "Y"+reverse(s.substring(1,len))+s.charAt(0)+"Z";
    }
    public static void main(String[] args)
    {
        String s="hanuman";
        System.out.println(reverse(s));
    }
}
