package linkedlist;

public class reverse {
    Node head;
    class Node 
    {
        int data;
        Node prev;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.prev=null;
           this. next=null;
        }
    }
       
        void  constructDLL(int arr[]) {
            Node temp=new Node (arr[0]);
             head=temp;
            int i=1;
            while(i<arr.length)
            {
                Node k=new Node(arr[i]);
                k.prev=temp;
                temp.next=k;
                temp=temp.next;
                i++;
            }
    }
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public  void reverseDLL()
{
    //Your code here
    if(head==null || head.next==null)
    {
        return;
    }
   
    Node firstp=head;
    Node temp=head;
    Node lastp=null;
    int count=0;
    while(temp!=null)
    {
       count++;
        lastp=temp; 
         temp=temp.next; 
        
          
            
     }

    //  lastp=lastp.next;
    while(count>0 )
    {
        int x=firstp.data;
        firstp.data=lastp.data;
        lastp.data=x;
        firstp=firstp.next;
        Node p=lastp.prev;
        lastp=p;
        count--;
    }
}
     void deleteAllOccurOfX( int x) {
        // Write your code here
        Node temp=head;
        if( temp.next==null)
        {
            if(temp.data==x)
            {
                head=null;
                return ;
            }
        }
        while(temp.data==x && temp.next!=null && temp.prev==null)
        {
            head=temp.next;
            temp=temp.next;
            temp.prev=null;  // 2,2,59,196,2,7,2
        }
        temp=head;
        while(temp.next!=null)
        {
            if(temp.data==x)
            {
                temp.prev.next=temp.next;
                temp.next.prev=temp.prev;
            }
            temp=temp.next;
        }
        if(temp.data==x)
        {
            temp.prev.next=temp.next;
        }
     }
    
    

 public static void main (String ars[])
 {
    reverse obj=new reverse();
    int arr[]={};
    obj.constructDLL(arr);
    //  obj.display();
     System.out.println();
    // obj.reverseDLL();
    obj.deleteAllOccurOfX( 265);
    obj.display();
 }
    
}
