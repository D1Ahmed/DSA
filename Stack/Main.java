class Node{
    Node next;
    int data;
    Node(int val)
    {
        next = null;
        data = val;
    }
}

class Stack{
    Node top= null;
    void push(int val)
    {
        Node node=new Node(val);
        if(top==null)
        {
            top = node;
            return;
        }
        node.next=top;
        top=node;
    }


    void pop()
    {
        top=top.next;
    }


    void peek()
    {
        System.out.println(top.data);
    }


}

public class Main {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);

        while(s1.top!=null)
        {
           s1.peek();
        s1.pop();
        }
    }
}