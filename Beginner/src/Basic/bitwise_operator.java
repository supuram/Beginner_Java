package Basic;
public class bitwise_operator
{
    public static void main(String[] args)
    {
        System.out.println(5 & 6);
        System.out.println(5 | 6);
        System.out.println(5 ^ 6);  //0^0=0, 0^1=1, 1^0=1, 1^1=0
        System.out.println(~5);  // ~0=1, ~1=0
        System.out.println(~0);
        System.out.println(5 << 6); /*Binary left shift operator. 5 gets shifted by 6 places to the left
        a<<b= a*Math.pow(2,b) */
        System.out.println(5 >> 6);  //Binary right shift operator. a>>b = a/(Math.pow(2,b))
        int n=6;
        if((n & 1) ==1)
        {
            System.out.println(n+" is odd");
        }
        else
        {
            System.out.println(n+" is even");
        }
    }
}
