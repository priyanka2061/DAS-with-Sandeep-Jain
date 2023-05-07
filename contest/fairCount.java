

public class fairCount {
           
        static  public long countFairPairs(int[] nums, int lower, int upper) {
            long count[]={0};
            mergesort(nums,0,nums.length-1,lower,upper,count); 
            return count[0]; 
        }
         static void mergesort(int nums[],int low,int high,int lower,int upper,long count[])
        {
            if(low<high)
            {
                 int mid=(low+high)/2;
                mergesort(nums, low, mid, lower, upper, count);
                mergesort(nums, mid+1, high, lower, upper, count);
                merge(nums, low,mid, high, lower, upper, count);
            }
        }
         static void merge(int[]nums,int low,int mid,int high,int lower ,int upper,long count[] )
         {
            int i=low;
            int j=mid+1;
            int b[]=new int[high-low+1];
            int help=high;
            while(help>=j && i<j)
            {
                long sum=nums[i]+nums[help];
                if(sum>=lower && sum<=upper)
                {
                    count[0]+=help-j+1;
                    i++;
                }
                if(sum<lower)
                {
                  i++;
                }
                if(sum>upper)
                {
                    help--;
                }
            }
            i=low;
            j=mid+1;
            help=0;
            while(i<=mid && j<=high)
            {
              if(nums[i]<=nums[high])
              {
                b[help++]=nums[i++];
              }
              else{
                b[help++]=nums[j++];
              }
            }
            while(i<=mid)
            {
                b[help++]=nums[i++];
            }
            while(j<=high)
            {
                b[help++]=nums[j++]; 
            }
            for(int k=0;k<b.length;k++)
            {
              nums[k+low]=b[k];
            }
         }
        public static void main (String args[])
        {
            int nums[]={0,0,0,0,0,0};
            System.out.println(countFairPairs(nums, 0,0));

        }
    }

