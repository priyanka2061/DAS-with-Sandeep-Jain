package stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class stack {
    

    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    void push(int a)
    {
	    // Your code here
	    q1.add(a);
    }
    
    //Function to pop an element from stack using two queues. 
    int pop()
    {
        int k=0;
          
       if(q1.size()==0)
           return -1;
         
     while(q1.size()!=0)
     {
         k=q1.peek();
         q2.add(q1.peek());
         q1.remove();
     }
     
    
     while(q2.size()>1)
     {
         q1.add(q2.peek());
         q2.remove();
     }
      
	   return k;
    }
	public static void main (String args[])
    {
        stack obj=new stack();
        obj.push(2);
        obj.push(3);
        obj.pop();
        obj.push(2);
        obj.pop();
        obj.push(8);
        obj.pop();
    }
}


