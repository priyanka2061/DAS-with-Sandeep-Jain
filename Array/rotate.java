package Array;

public class rotate {
   int nums[]={1,2,3,4,5,6,7};

        public void rotate(int[] nums, int k) {
            int n=nums.length;
            
            int arr[]=new int[n];
            int i=0;
            while(k>0)
            {
             arr[i]=nums[n-k+i];
             k--;
             i++;
            }
            for(int j=0;j<n-k;j++)
            {
                arr[i++]=nums[j];
            }
            for(int j=0;j<n;j++)
            {
                nums[j]=arr[j];
            }
            // int j=n-1;
            // while(k>0)
            // {
            //    int temp=nums[n-1];
            //   for(int i=n-1;i>0;i--)
            //   {
            //       nums[i]=nums[i-1];
            //   }
            //   nums[0]=temp;
            //   k--;
            // }
            
        } 
    }

