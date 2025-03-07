public class QueueArr {
    int arr[];
    static int front=-1;
    static int back=-1;
    QueueArr(int size)
    {
        arr=new int[size];
    }
    void enqueue(int val)
    {
        if(front==-1)
        {
            front++;
            back++;
            arr[front]=val;
        }
        else{
            back++;
            arr[back]=val;
        }
    }
    void dequeue()
    {
        front++;
    }
    void peek()
    {
        System.out.println(arr[front]);
    }

    public static void main(String[] args) {
        QueueArr q1=new QueueArr(10);
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);
        q1.enqueue(2);
        q1.enqueue(1);
        int meow=back;
        meow++;
        while(front!=meow)
        {
            q1.peek();
            q1.dequeue();
        }
    }
}
