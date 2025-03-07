public class CircularLinkedList {
    Dnode head=null;
    Dnode tail=null;
    public void Add(int val)
    {
        Dnode node =new Dnode(val);
        if(head==null)
        {
            head=node;
            tail=node;
            node.next=head  ;

        }
        else{
            Dnode slider=head;
            while(slider.next!=head)
            {
                slider=slider.next;
            }
            slider.next=node;
            node.next=head;
            tail=node;
        }


    }
    public void addAtAny(int index, int val)
    {
        Dnode slider=head;
        Dnode slider2=head;
        Dnode node = new Dnode(val);

        for(int i=2;i<index;i++)
        {
            slider=slider.next;
        }

        for(int i=1;i<index;i++)
        {
            slider2=slider2.next;
        }
        slider.next=node;
        node.prev=slider;
        node.next=slider2;
        slider2.prev=node;
    }
    public void display()
    {
        System.out.println("control yahan");
        Dnode trav=head;
        System.out.println("Printing in forward");
        System.out.print(trav.data+"<->");
        trav=trav.next;
        while(trav.next!=head.next)
        {
            System.out.print(trav.data+"<->");
            trav=trav.next;
        }
        System.out.println("Head");
    }



}
class meow{
    public static void main(String[] args) {
        CircularLinkedList cl=new CircularLinkedList();
        cl.Add(1);
        cl.Add(2);
        cl.Add(3);
        cl.Add(2);
        cl.Add(1);


        cl.display();
    }
}
