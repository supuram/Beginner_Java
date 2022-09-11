package String_;
public class string_compress
{
    public static String compress(String str)
    {
        int i;
        String newstr="";
        int len=str.length();
        for(i=0;i<len;i++)
        {
            Integer count=1;
            while(i<len-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            newstr+=str.charAt(i);
            if(count>1)
            {
                newstr=newstr+count.toString();
            }
        }
        return newstr;
    }
    public static void main(String[] args)
    {
        String str="aabbcc";
        System.out.println(compress(str));
    }
}
