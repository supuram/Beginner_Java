package String_;
public class string_longestword {
    public void lengthOfLastWord(String s)
    {
        int len=s.length();
        System.out.println(len);
        int i,start=0,end=0,length=0,max=0,max_start=0,max_end=0;
        for(i=0;i<len;i++)
        {
            if(s.charAt(i)==' ')
            {
                end=i;
                length=end-start-1;
                if(length>max)
                {
                    max=length;
                    max_start=start;
                    max_end=end;
                }
            }
            start=end;
            if(i==(len-1))
            {
                end=i;
                length=end-start;
                if(length>max)
                {
                    max=length;
                    max_start=start;
                    max_end=end+1;
                }
            }
        }
        System.out.println("Length of the longest word = "+max);
        for(i=(max_start+1);i<max_end;i++)
        {
            System.out.print(s.charAt(i));
        }
        //return max;
    }
    public static void main(String[] args)
    {
        String s="Hello world supratikgood boy digout";
        string_longestword obj=new string_longestword();
        obj.lengthOfLastWord(s);
    }
}