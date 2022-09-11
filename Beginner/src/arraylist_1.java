import java.util.ArrayList;
import java.util.Collections;
public class arraylist_1
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<Integer>();      /*ArrayList can only store objects.
        It cannot store primitive types*/

        System.out.println(list);
        //ADD ELEMENTS
        int i;
        for(i=1;i<=10;i++)
        {
            list.add(i*i);
        }
        System.out.println(list);

        //GET ELEMENTS
        for(i=0;i<10;i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //ADD ELEMENTS IN BETWEEN
        list.add(1,2099);  //at index 1, 2099 is added
        System.out.println("Added ArrayList = "+list);

        //CHANGE AN ELEMENT AT A PARTICULAR INDEX
        list.set(3,67);  //the value at index 3 is changed to 67
        System.out.println("Modified ArrayList = "+list);

        //DELETE ELEMENT
        list.remove(4);    //index 4 is deleted
        System.out.println("Deleted ArrayList = "+list);

        //SIZE OF ARRAYLIST
        System.out.println("Size of the arraylist = "+list.size());

        //SORT AN ARRAYLIST
        Collections.sort(list);
        System.out.println("Sorted ArrayList = "+list);

        list.add(788);
        System.out.println("Added ArrayList = "+list);
    }
}
