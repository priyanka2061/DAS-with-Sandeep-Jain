import java.util.Map;
import java.util.TreeMap;

class minimumString{
    int max(TreeMap<Integer,Integer>map,int k)
    {
        int count=0;
        int val=0;
          System.out.println(map);
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            count+=entry.getValue();
            if(count==k)
            val=entry.getKey();
        }
         System.out.println(val);
        return val;
    }
        public int[] maxSlidingWindow(int[] nums, int k) {
         TreeMap<Integer,Integer>map=new TreeMap<>();
         int i=0;
         int j=0;
         int p=0;
         int ans[]=new int[nums.length-k+1];
         while(j<nums.length)
         {
             if(j-i+1<=k)
             {
                 map.put(nums[j],map.getOrDefault(nums[j],0)+1);
             }
             else if(j-i+1==k)
             {
                 ans[i]=max(map,k);
                map.put(nums[i],map.getOrDefault(nums[i],0)-1);
                if(map.get(nums[i])==0)
                map.remove(nums[i]);
                 i++;
             }
            
         }
         return ans;
        }
        public static void main(String[] args) {
            int nums[]={1,3,-1,-3,5,3,6,7};
            int k=3;
            minimumString obj=new minimumString();
            obj.maxSlidingWindow(nums,k);
        }
    }