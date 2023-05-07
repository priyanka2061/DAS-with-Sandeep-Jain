import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class knight {
     static public int findSmallestInteger(int[] nums, int value) {
       Map<Integer,Integer>map=new HashMap<>();
       Arrays.sort(nums);
       int mp=0;
       for(int i=0;i<nums.length;i++)
       {
           int k=nums[i]%value;
           if(!map.containsKey(k))
           {
               mp=0;
               map.put(k,1);
           }
           else
           {
    
                 mp=mp+k+value;
                map.put(mp,1);
             
              
           }
       }
         int m=0;
      List<Integer>l=new ArrayList<>();
     for(Map.Entry<Integer,Integer>entry:map.entrySet())
     {
         l.add(entry.getKey());
        System.out.println(entry.getKey());
            
     }
   
     for(int i=0;i<=nums.length;i++)
     {
         
         if(!l.contains(i))
         {
             return i;
         }
     }
       return -1;
    }
    public static void main(String args[])
    {
        int nums[]={3,0,3,2,4,2,1,1,0,4};
        findSmallestInteger( nums, 2);
    }
}