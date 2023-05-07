package linkedlist;

public class singly {
    node head;
class node
{
    int data;
    node next;
    node(int d)
    {
        data=d;
        next=null;
    }
    
}
public void  insert()
{
     head=new node(8);
    head.next=new node(9);
    head.next.next=new node(7);
    
}
void display()
{
    node temp=head;
    while(temp.next!=null)
    {
        System.out.println(temp.data);
        temp=temp.next;
    }
    System.out.println(temp.data);
}

node insertAtBeginning( int x)
    {
       if(head==null)
       {
          node n=new node(x);
          head=n;
       }
       else
       {
         node temp=head;
        head=new node(x);
        head.next=temp;
       }
       return head;
       
    }
    
    //Function to insert a node at the end of the linked list.
    node insertAtEnd( int x)
    {
        // code here
       
        if(head==null)
        {
            node n=new node(x);
            head=n;
           
        }
        else
        {
             node temp=head;
        while(temp!=null)
        {
            temp=temp.next;
        }
        node n=new node(x);
        temp=n;
        n.next=null;
        }
         return head;
    }
    public static void main (String args[])
    {
       singly obj=new singly();
       obj.insert();
       obj.display();
        obj.insertAtEnd( 8);
        obj. insertAtEnd( 3);

    }
}

