import java.util.Stack;

public class de {
    

    //Function to delete middle element of a stack.
     static void sol(Stack<Integer>s,int mid,int count)
    {
        if(mid==count)
        {
           s.pop();
           return;
        }
         int k=s.pop();
         sol(s,mid,count+1);
          s.push(k);
          
      
         
    }
     static public void deleteMid(Stack<Integer>st,int sizeOfStack){
        if(st.empty())
            return;
        int mid=(int)Math.ceil((st.size()+1)/2);
         System.out.println(mid);
        sol(st,mid,0);
       while(!st.isEmpty())
       {
           System.out.print(st.pop()+" ");
           
       }
    } 
    public static void main (String args[])
    {
        Stack<Integer>s=new Stack<Integer>();
        s.push(1);     
        s.push(34);     
        s.push(23);
        s.push(17);
        s.push(37);
        s.push(42);
        s.push(13);
        s.push(39);
        s.push(0);
        s.push(53);
        s.push(49);
        s.push(6);
        s.push(71);
        
      //1 34 23 17 37 42 13 39 0 53 49 6 71
    
        deleteMid(s,s.size());
    }
}

