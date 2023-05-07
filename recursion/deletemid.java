import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class deletemid {
   static void solve(Stack<Integer>stack,int n)
   {
     if(n/2==stack.size()-1)
     {
       stack.pop();
       return;
     }
     int m=stack.peek();
     stack.pop();
     solve(stack,n);
     stack.push(m);
     return;
   }
    public static void main(String args[])
    {
     
      List<Integer>list=new ArrayList<>(List.of(9,0,2,3,4));
      Stack<Integer>stack=new Stack<>();
      stack.addAll(list);
      while(!stack.empty())
        {
            System.out.println(stack.peek());
            stack.pop();
        }
        stack.addAll(list);
      solve(stack,stack.size());
      System.out.println();
      while(!stack.empty())
        {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
    
}
