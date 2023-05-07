public class findsum {
    /**
     * @param nums
     * @return
     */
    static  public int minimizeSum(int[] nums) {
        int max=0;
        int j=1;
        int index=0;
        int i=0;
        for(i=0;i<nums.length-1;i++)
        {
            if(max<Math.abs(nums[i]-nums[j]))
            {
                index=i;
                max=Math.max(max,Math.abs(nums[i]-nums[j]));
                
            }
            j++;
        }
        int min=Integer.MAX_VALUE;
       
        if(index==0)
        {
            nums[index]=nums[index+2];
            nums[index+1]=nums[index];
        }
       else
        {
      
        nums[index]=nums[index-1];
        nums[index+1]=nums[index];
        }
        j=1;
        max=0;
        for(int ii=0;ii<nums.length-1;ii++)
        {
          min=Math.min(min,Math.abs(nums[ii]-nums[j]));  
          max=Math.max(max,Math.abs(nums[ii]-nums[j]));
          j++;
        }
            
        
        System.out.println(min+max);
        return min+max;
       
        
    }
    public static void main (String args[])
    {
        int nums[]={1,4,3};
        minimizeSum(nums);

    }
}
