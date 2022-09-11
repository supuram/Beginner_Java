package String_;
// Remove Duplicates in a string
import java.lang.String;
public class remove_duplicate
{
    static void remove_dup(String str)
    {
        StringBuilder sb=new StringBuilder(str);
        int len=sb.length()-1;
        System.out.println(len);
        for(int i=0;i<=len-1;i++)
        {
            for(int j=i+1;i<=len;j++)
            {
                if(sb.charAt(i)==sb.charAt(j))
                {
                    /*StringBuilder s1=sb.substring(i,j);
                    StringBuilder s2=sb.substring(j+1,len);
                    sb=s1.append(s2);*/
                    sb.delete(j,j+1);
                    //len=sb.length()-1;
                }
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args)
    {
        String str="ssuuppratikk";
        remove_dup(str);
    }
}
