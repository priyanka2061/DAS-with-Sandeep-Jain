class binary_pivot {
     int binary_search(int[] nums,int target,int start,int end)
    {
        int ind=0;
        while(start<=end)
        {
             int mid=start+(end-start)/2;
            if(nums[mid]==target)
            {
                ind=mid;
               return ind;
            }
            else if(target<nums[mid])
            {
                 start=mid+1;
            }
            else if(target>nums[mid])
            {
                end=mid-1;
            }   
        }
        return ind;
    }
    public int search(int[] nums, int target) {
        int n=nums.length;
       if(nums[0]==target )
         return 0;
        if(nums[n-1]==target)
         return n-1;
         int start=0;
         int end=nums.length-1;
         int pivot=-1;
         while(start<=end)
         {
            int mid=start+(end-start)/2;
            int prev=(mid+n-1)%n;
            int next=(mid+1)%n;
            if(nums[prev]>=nums[mid] && nums[mid]<=nums[next])
            {
               pivot=mid;
               break;
            }
            else if(nums[start]<=nums[mid])
            {
                 start=mid;
            }
            else if(nums[end]>=nums[mid])
            {
                end=mid-1;
            }
         } 
          System.out.println(pivot);
          if(pivot==-1)
          return -1;
          
         int ind=binary_search(nums,target,0,pivot-1 );
         if(nums[ind]==target)
         return ind;
         int ind1=binary_search(nums,target,pivot,n-1);
          if(nums[ind1]==target)
         return ind1;

         return -1;

    }
    public static void main (String args[])
    {
        binary_pivot obj=new binary_pivot();
        int[] nums={4,5,6,7,0,1,2};
        int target=0;
        int ans=obj.search(nums,target);
        System.out.println(ans);
    }
}