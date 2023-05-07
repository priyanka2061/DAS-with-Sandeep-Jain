import java.util.*;

public class stackSort {
    static void insert(Stack<Integer>stack,int m)
    {
        if(stack.empty())
        {
            stack.push(m);
            return;
        }
       int n=stack.peek();
       stack.pop();
       insert(stack,m);
       stack.push(n);
       return;
    }
    static void solve(Stack<Integer>stack)
    {
        if(stack.empty())
        return;
        int m=stack.peek();
        stack.pop();
        
        solve(stack);
        insert(stack,m);
        return ;
    }
    /**
     * @param args
     */
    public static void main (String args[])
    {
        Stack<Integer> stack = new Stack<>();
      List<Integer> list = Arrays.asList(7, 2, 1, 5, 7, 1, 0);
       stack.addAll(list);
       while(!stack.empty())
       {
           System.out.println(stack.peek());
           stack.pop();
       }
       stack.addAll(list);
        solve(stack);
        System.out.println();
        while(!stack.empty())
        {
            System.out.println(stack.peek());
            stack.pop();
        }

        System.out.println();
        String s="101011";
    }
}
