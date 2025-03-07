class Node{
    Node next;
    int data;
    Node(int val)
    {
        data=val;
        next=null;
    }
}
class Queue{
    Node front=null;
    Node back=null;

    void enqueue(int val)
    {
        Node node=new Node(val);
        if(front==null)
        {
            front=node;
            back=node;
        }
        else {
            back.next=node;
            back=back.next;
        }
    }
    void dequeue()
    {
        front=front.next;
    }
    void peek()
    {
        System.out.println(front.data);
    }
    boolean isEmpty()
    {
        if(front==null)
        {
            System.out.println("Queue is empty");
            return true;
        }
        else {
            System.out.println("Queue is not empty");
            return false;
        }
    }
    int size()
    {

        int size=0;
        Node slider=front;
        if(front==null)
        {
            System.out.println("empty");
            return size;
        }
        while (slider!=null)
        {
            size++;
            slider=slider.next;
        }
        System.out.println("size is "+ size);
        return size;

    }


}

public class Main {
    public static void main(String[] args) {
        Queue q1=new Queue();
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.dequeue();
        q1.peek();
        q1.size();
    }
}