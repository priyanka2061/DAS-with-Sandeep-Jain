

import java.util.HashMap;

public class goodArray
{
    public static long countGood(int[] nums, int k) {
        int result=0;
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        int i=0;
        int j=0;
        while(j<nums.length)
        {

           if(!map.containsKey(nums[j]))
           {
             map.put(nums[j],1);
             
           }
           else
           {
            map.put(nums[j],map.get(nums[j])+1);
           }
           count+=map.get(nums[j])-1;
          while(count>=k)
           {
             
            result+=(nums.length-j);
            int icount=map.get(nums[i]);
            count-=icount-1;//new count 
            map.put(nums[i],map.get(nums[i])-1);
            if(map.get(nums[i])==null)
            map.remove(nums[i]);
             i++;
        }
        j++;
        }
        return result;
    }
    public static void main (String args[])
    {
        int nums[]={2,1,3,1,2,2,3,3,2,2,1,1,1,3,1};
        
        int k=11;
      System.out.println(countGood(nums,k));
      
    }
}