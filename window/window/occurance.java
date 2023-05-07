// find negative occurance of a subarray
package window;

import java.util.ArrayList;
import java.util.List;

public class occurance {
    static  public void solve(int arr[],int k)
    {
       List<Integer>list=new ArrayList<>();
       int j=0;
       int i=0;
       int max=0;
       while(j<arr.length)
       {
       if(arr[j]<0)
       {
        list.add(arr[j]);
       }
        if((j-i+1)<k)
        {
            j++;
        }
        else if((j-i+1)==k)
        {
            if(list.isEmpty())
            {
                System.out.println("0");
            }
            else
            {
           System.out.println(list.get(0));
            
          if(list.get(0)==arr[i])
          {
            list.remove(0);
          } 
        }
            i++;
            j++;
        }
       }
       System.out.println(max);
    }
    public static void main (String args[])
    {
        int arr[]={8,-2,-4,-1,2,-1,3};
        solve(arr,3);
    }
    
}
