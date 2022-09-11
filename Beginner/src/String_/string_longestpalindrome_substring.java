package String_;
public class string_longestpalindrome_substring
{
        public static void longestPalindrome(String s)
        {
            int length=s.length();
            String str=" ";
            String max_str=" ";
            int i,j,k,max=0;
            if(s==" ")
            {
                System.out.println(s);
            }
            for(i=0;i<length;i++)
            {
                for(j=i+1;j<=length;j++)
                {
                    str=s.substring(i,j);
                    System.out.println(str+" "+i+" "+j);
                    int len=str.length();
                    System.out.println("length of "+str+"= "+len);
                    if(len%2==0)
                    {
                        for(k=0;k<len/2;k++)
                        {
                            if(str.charAt(k)!=str.charAt(len-k-1))
                            {
                                len=0;
                                break;
                            }
                        }
                    }
                    else
                    {
                        for(k=0;k<=len/2;k++)
                        {
                            if(str.charAt(k)!=str.charAt(len-k-1))
                            {
                                len=0;
                                break;
                            }
                        }
                    }
                    if(len>max)
                    {
                        max=len;
                        max_str=str;
                        //System.out.println(str);
                    }
                }
            }
            System.out.println(max_str);
        }
        public static void main(String[] args)
        {
            String s="hjjh good hu lololo malayalam";
            longestPalindrome(s);
        }
}
