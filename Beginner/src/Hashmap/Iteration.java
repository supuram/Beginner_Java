package Hashmap;
import java.util.HashMap;
import java.util.Set;
public class Iteration
{
    public static void main(String[] args)
    {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India", 200);
        map.put("China", 150);
        map.put("Nepal", 10);

        Set<String> keys = map.keySet();
        System.out.println(keys);
        for(String k : keys)
        {
            System.out.println(k+" "+map.get(k));
        }
    }
}