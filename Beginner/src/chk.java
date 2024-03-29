public class chk
{
    public static void printArr(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void QS(int[] arr, int si, int ei)
    {
        if(si >= ei)
        {
            return;
        }
        int pidx = partition(arr, si, ei);
        //System.out.println(ei+","+si);
        printArr(arr);
        System.out.println(si);
        QS(arr, si, pidx - 1);  // left part
        QS(arr, pidx + 1, ei);  // right part
    }

    public static int partition(int[] arr, int si, int ei)
    {
        int pivot = arr[ei];
        int i = si - 1;  // to make place for elements smaller than pivot
        for(int j = si; j < ei; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        arr[ei] = arr[i];
        arr[i] = pivot;
        return i;
    }
    public static void main(String[] args)
    {
        int[] arr = {6,3,9,8,2,5};
        QS(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
