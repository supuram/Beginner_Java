public class chk
{
    public static int get(int n)
    {
        return n*n;
    }
    public static void main(String[] args)
    {
        int i=0;
        for(;i<8;i++)
        {
            int a = get(i);
            System.out.print(a+";");
        }
    }
}