package Stack_and_Queue.Queue;
public class queue_circularqueue
{
        int[] arr;
        int size, rear=-1, front=-1;
        queue_circularqueue(int size)
        {
            arr=new int[size];
            this.size=size;
        }
        public boolean isEmpty()
        {
            return rear==-1 && front==-1;
        }
        public boolean isFull()
        {
            return (rear+1)%size==front;
        }
        public void add(int data)
        {
            if(isFull())
            {
                System.out.println("Full Queue");
                return;
            }
            if(front==-1)
            {
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public int remove()
        {
            if(isEmpty())
            {
                System.out.println("Empty Queue");
                return -1;
            }
            int result=arr[front];
            if(rear==front)
            {
                rear=front=-1;
            }
            else
            {
                front=(front+1)%size;
            }
            return result;
        }
        public int peek()
        {
            if(isEmpty())
            {
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }
        public static void main(String[] args)
        {
            queue_circularqueue q=new queue_circularqueue(5);
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            System.out.println(q.remove());
            q.add(6);
            System.out.println(q.remove());
            q.add(7);
            while(!q.isEmpty())
            {
                System.out.println(q.peek());
                q.remove();
            }
        }
}
