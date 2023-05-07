package Array;
public class MergeArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
        int low=0;
      int right=0;
    //   int left=m-1;
      int k=0;
       int size=m+n;
        while(low<m && right<n)
        {
            if(nums1[low]<=nums2[right])
            {
               
               low++;
               right++;
            }
            else
            {
                for(int i=k;i<size-1;i++)
                {
                    nums1[i+1]=nums1[i];
                }
                nums1[k++]=nums2[right++];
                // low++;
            }
        }
    
            while(right<n)
            {
            nums1[k++]=nums2[right++];
            }
        
       
    }

    
    public static void main (String args[])
    {
        MergeArray obj=new MergeArray();
        int nums1[] = {4,0,0,0,0,0};
        int  m = 1;
        int nums2[] = {1,2,3,5,6};
          int n = 5;
        obj.merge(nums1,m,nums2,n);
        for(int i=0;i<nums1.length;i++)
        {
            System.out.print(nums1[i]+" ");
        }
    }
}