package Hashmap;
import java.util.HashMap;
public class Basics
{
    /*
    HashMap is a Data Structure. It has two things - a key and a value. HashMap(key, value). Key is
    unique and you cannot change it but values can be changed for a particular key.
     */
    public static void main(String[] args)
    {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India",200);
        map.put("China",150);
        System.out.print(map.get("India"));
    }
}
