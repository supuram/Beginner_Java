package String_;
import java.util.*;
public class strings_9 {
    public static void main(String[] args)
    {
        int i;
        String name="Supratik";
        System.out.println(name);
        System.out.println("**************USER INPUT FOR STRING**********************");
        System.out.println("Enter a string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println("******************CONCATENATION OF STRING**********************");
        System.out.println("Enter a string");
        String str1=sc.nextLine();
        System.out.println("Enter another string");
        String str2=sc.nextLine();
        String sum_str=str1+" "+str2;
        System.out.println(sum_str);
        System.out.println("******************LENGTH OF STRING*******************");
        int len=sum_str.length();
        System.out.println("Length of the string = "+len);
        System.out.println("******************charAt FUNCTION**********************");
        for(i=0;i<len;i++)
        {
            System.out.println((i+1)+"th character = "+sum_str.charAt(i));
        }
        System.out.println("******************compareTo FUNCTION**********************");
        if(str1.compareTo(str2)>0)
        {
            System.out.println(str1);
        }
        else if(str1.compareTo(str2)<0)
        {
            System.out.println(str2);
        }
        else if(str1.compareTo(str2)==0)
        {
            System.out.println("Strings are equal");
        }
        System.out.println("******************SUBSTRING************************");
        System.out.println(sum_str.substring(2,3));  //goes from 2 to 3
        System.out.println("*****************STRING BUILDER**********************");
        StringBuilder sb=new StringBuilder(sum_str);
        System.out.println(sb);
        System.out.println("******************SET CHAR AT ANY INDEX***********************");
        for(i=0;i<len;i++)
        {
            if(i%6==0)
            {
                sb.setCharAt(i,'P');
            }
        }
        System.out.println("Modified string = "+sb);  /*Strings cannot be modified. It can be modified
        using StringBuilder*/
        System.out.println("******************INSERT IN ANY STRING************************");
        sb.insert(3,'J');
        System.out.println(sb);
        System.out.println("******************DELETE A SUBSTRING************************");
        sb.delete(4,10);  //it will go from 4 to 9
        System.out.println("Deleted string = "+sb);
        System.out.println("******************REVERSE A STRING************************");
        sb.reverse();
        System.out.println("Reversed string = "+sb);
    }
}