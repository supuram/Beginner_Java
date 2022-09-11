package Recursion;
// Remove Duplicates in a string
public class recursion_remdup_in_str
{
    static void rem_dup(String str,int idx,StringBuilder newStr, boolean[] map) {
        if (idx == str.length())
        {
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']) {
            System.out.println(map[currChar-'a']+" "+idx);
            rem_dup(str, idx + 1, newStr, map);
        }
        else {
            System.out.println(map[currChar-'a']+" "+idx);
            map[currChar-'a']=true;
            rem_dup(str,idx+1,newStr.append(currChar),map);
        }
    }
    public static void main(String[] args)
    {
        String str="ssuuppratikk";
        rem_dup(str,0,new StringBuilder(" "),new boolean[25]);
    }
}
