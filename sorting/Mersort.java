package sorting;

public class Mersort {
    static void merge(int arr[],int low,int mid,int high)
    {
          int b[]=new int[high+1];
          int i=low;
          int j=mid+1;
          int k=0;
          while(i<=mid && j<=high)
          {
            if(arr[i]>=arr[j])
            {
                 b[k++]=arr[j++];
            }
            else
            {
                b[k++]=arr[i++];
            }
          }
          if(i<=mid)
          {
            while(i<=mid)
            {
                b[k++]=arr[i++];
            }
          }
          else
          {
            while(j<=high)
            {
                b[k++]=arr[j++];
            }
          }
          for(int l=low;l<=high;l++)
          {
            arr[l]=b[l-low];
          }
    }
    static void mergesort(int arr[],int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public static void main (String args[])
    {
        int arr[]={2,3,1,7,0,9,8};
        mergesort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
        {
          System.out.print(arr[i]+" ");
        }
    }
}
