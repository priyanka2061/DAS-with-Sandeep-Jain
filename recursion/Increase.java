//

import java.util.ArrayList;
import java.util.List;

public class Increase {
    
   static void solve( List<List<Integer>>res,List<Integer>list,int[]nums,int index)
     
      
        {   
      
            if (index >= nums.length) {
                
                    res.add(new ArrayList(list));
                    return;
                }
               for(int i=index;i<nums.length;i++)
               {
                //  if(nums[index]<=nums[i])
                //  {
                 list.add(nums[i]);
                solve(res, list, nums, index + 1);
                 
               }
               
                  list.remove(list.size() - 1); 
          
        }
    

    public static void main(String args[]) {
        int nums[] = { 4, 6, 7, 7 };
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        solve(res, list, nums, 0);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }

    }
}

