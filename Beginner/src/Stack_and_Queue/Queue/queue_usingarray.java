package Stack_and_Queue.Queue;
public class queue_usingarray
{
    int[] arr;
    int size, rear=-1;
    queue_usingarray(int size)
    {
        arr=new int[size];
        this.size=size;
    }
    public boolean isEmpty()
    {
        return rear==-1;
    }
    public void add(int data)
    {
        if(rear==size-1)
        {
            System.out.println("Full Queue");
            return;
        }
        rear++;
        arr[rear]=data;
    }
    public int remove()
    {
        if(isEmpty())
        {
            System.out.println("Empty Queue");
            return -1;
        }
        int front=arr[0];
        //shifting of array elements to the front
        for(int i=0;i<rear;i++)
        {
            arr[i]=arr[i+1];
        }
        rear--;
        return front;
    }
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Empty Queue");
            return -1;
        }
        return arr[0];
    }
    public static void main(String[] args)
    {
        queue_usingarray q=new queue_usingarray(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
