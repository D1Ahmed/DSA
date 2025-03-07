public class LinkedList {
    Node tail=null;
    Node head =null;


    public void Insert(int val)
    {

        Node trav=null;



        Node node=new Node(val);
        if(head==null)
        {
            head=node;
        }

       else{
            trav=head;
            while(trav.next!=null)
            {
               trav= trav.next;
            }
            trav.next=node;
            trav=node;
            trav.next=null;
            tail=node;

        }

    }

    void InsertAtStart(int val)
    {
        Node node = new Node(val);
        node.next=head;
        head=node;
    }


    void insertInBetween(int index, int val)
    {
        Node trav=head;
        Node temp=head;
        int size=0;
        int counter=1;

        Node node = new Node(val);

        trav=head;
        while(counter!=index)
        {
            trav=trav.next;
            counter++;
        }
        temp=trav.next;
        trav.next=node;
        node.next=temp;


    }

    void insertInBBetween(int index, int val)
    {
        Node trav=head;
        int counter=2;

        Node node = new Node(val);

        trav=head;
        while(counter!=index)
        {
            trav=trav.next;
            counter++;
        }
       
        node.next=trav.next;
        trav.next=node;

    }

    public void deleteAtStart()
    {
        head=head.next;
    }
    public void deleteByIndex(int index)
    {
        if(index==1)
        {
            deleteAtStart();
        }
        else {
            Node trav=head;
            int count=2;
            while(count!=index)
            {
                trav=trav.next;
                count++;
            }
            Node temp=trav.next.next;
            trav.next=temp;
        }

    }
    void deleteAtAny(int index)
    {
        if(index==1)
        {
            deleteAtStart();
        }
        else{
            Node slider=head;
            for(int i=2;i<index;i++)
            {
                slider=slider.next;
            }
            // System.out.println(slider.data);
            slider.next=slider.next.next;
        }

    }
    public void search(int val) {
        Node trav = head;
        int index=1;
        while (trav != null)
        {
            if(trav.data==val)
            {
                System.out.println(val+" is found at index "+index);
                return;
            }
            trav=trav.next;
            index++;
        }
        System.out.println("Value not found");
    }
    public void InsertPechay(int index,int val)
    {
        Node trav=head;
        int count=2;
        Node node=new Node(val);
        while(count!=index)
        {
            trav=trav.next;
            count++;
        }
        Node temp=trav.next;
        trav.next=node;
        node.next=temp;
       // System.out.println(trav.data);

    }
    public void InsertPechaybyVal(int indexVal,int val)
    {
        Node trav=head;
        Node node=new Node(val);
        while(trav.next.data!=indexVal)
        {
            trav=trav.next;
        }
        Node temp=trav.next;
        trav.next=node;
        node.next=temp;


    }
    public void reverse()
    {
        int size=1;
        Node prev=head;
        Node mid=head.next;
        Node next=head.next.next;
        System.out.println("meow");

        while(mid!=null)
        {
            mid.next=prev;
            prev=mid;
            mid=next;
            next=next.next;

           if(next!=null)
            {
                next=next.next;
            }
        }

        head.next=null;
        while(prev!=null)
        {
            System.out.print(prev.data+"->");
            prev=prev.next;
            if(prev==null)
            {
                System.out.print("NULL");
            }
        }

    }


    public void display()
    {
        Node trav=head;

        while(trav!=null)
        {
            System.out.print(trav.data+"->");
            trav=trav.next;
            if(trav==null)
            {
                System.out.print("NULL");
            }
        }
    }
    public void palindrome()
    {
        Node s1=head;
        Node s2=tail;
        Node size=head;
        int meow=1;
        int length=0;
        while(size!=null)
        {
            size=size.next;
            length++;
        }
        System.out.println(length);
        int s=length;
        while(meow<=(s/2))
        {

            if(s1.data==s2.data)
            {
                s1=s1.next;
                s2=head;
                length--;
                for(int i=1;i<length;i++)
                {
                    s2=s2.next;
                }

            }
            else {
                System.out.println("not a palindrome");
                return;
            }
        meow++;

        }
        System.out.println("LL is palindrome");

    }

    public void Reverse(){

        Node prev=head;
        Node mid=head.next;
        Node last=head.next.next;

        while(mid!=null){
            mid.next=prev;
            prev=mid;
            mid=last;
            while(last!=null){
                last=last.next;
            }
        }



        head.next=null;
        while(mid!=null){

            System.out.print(mid.data+" ");
            mid=mid.next;
        }
    }


    public static void main(String[] args) {

        LinkedList l1=new LinkedList();
        l1.Insert(1);
        l1.Insert(2);
        l1.Insert(3);
        l1.Insert(4);
        l1.Insert(5);

        l1.display();
        System.out.println();
        l1.Reverse();




    }
}
