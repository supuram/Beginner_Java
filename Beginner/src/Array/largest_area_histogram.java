package Array;
public class largest_area_histogram
{
    public static void main(String[] args)
    {
        int[] arr = {5, 6, 5, 6, 2, 3};
        int max=0;
        for(int i=0;i<6;i++)
        {
            int sum=arr[i];
            for(int j=i-1;j>=0;j--)
            {
                if (arr[j] >= arr[i])
                {
                    sum = sum + arr[i];
                }
                else
                {
                    break;
                }
            }
            for(int j=i+1;j<6;j++)
            {
                if(arr[j]>=arr[i])
                {
                    sum=sum+arr[i];
                }
                else
                {
                    break;
                }
            }
            if(sum>max)
                max=sum;
        }
        System.out.print("Max area = "+max);
    }
}
