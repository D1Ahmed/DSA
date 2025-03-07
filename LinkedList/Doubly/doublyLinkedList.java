public class doublyLinkedList {
    Dnode head=null;
    Dnode tail=null;
public void add(int val)
{
    Dnode trav =head;

    Dnode node = new Dnode(val);
    if(head==null)
    {
        head=node;
    }
    else{
        while(trav.next!=null)
        {
            trav=trav.next;
    
        }
        node.prev=trav;
        trav.next=node;
        tail=node;
    }
}

public void display()
{
    Dnode trav=head;
    System.out.println("Printing in forward");
    while(trav!=null)
    {
        System.out.print(trav.data+"<->");
        trav=trav.next;
    }

    System.out.println("NULL");
    trav=tail;
    /*
    System.out.println("Printing in backward");
    while(trav!=null)
    {
        System.out.print(trav.data+"<->");
        trav=trav.prev;
    }

    System.out.println("NULL");

     */

}
void addAtAny(int index,int data)
{
    Dnode node=new Dnode(data);
    Dnode trav =head;
    for(int i=2;i<index;i++)
    {
        trav=trav.next;
    }
    node.next=trav.next;
    trav.next=node;
}
void addAtEnd(int val)
{
    Dnode node = new Dnode(val);
    node.prev=tail;
    tail.next=node;
    tail=node;
}
void deleteAtStart()
{
    if(head!=null)
    {
        head=head.next;
        head.prev=tail;
    }
    else {
        System.out.println("list is empty");
    }
}
void deleteAtAny(int index)
{
    if(index==1)
    {
        deleteAtStart();
    }
    else{
        Dnode slider=head;
        for(int i=2;i<index;i++)
        {
            slider=slider.next;
        }
       // System.out.println(slider.data);
        slider.next=slider.next.next;
        slider.next.prev=slider;
    }

}
void reverse()
{
    Dnode slider=tail;
    while(slider!=head)
    {
        slider=slider.prev;
    }
}


void search(int val)
{
    int index= 1;

    Dnode slider=head;
    while(slider.next!=null)
    {
        if(slider.data==val)
        {
            System.out.println("value found at index " + index);
            return;
        }
        slider=slider.next;
        index++;
    }
    System.out.println("value not found");
}

    public void palindrome()
    {
        Dnode s1=head;
        Dnode s2=tail;
        int h=0;
        while(s1!=s2)
        {
            if(s1.data==s2.data)
            {
                s1=s1.next;
                s2=s2.prev;
            }
            else{
                System.out.println("not a pineapple");
                h=1;
                break;
            }
        }
        if(h==0)
        {
            System.out.println("Your pineapple is a pineapple");
        }
    }



    public static void main(String[] args) {
        doublyLinkedList dbL=new doublyLinkedList();
        dbL.add(1);
        dbL.add(2);
        dbL.add(2);
        dbL.add(2);
        dbL.add(3);
        dbL.add(2);
        dbL.add(1);

        dbL.palindrome();

        dbL.display();

    }
}
