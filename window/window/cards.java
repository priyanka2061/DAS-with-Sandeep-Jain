package window;

public class cards {
    
    static  public int maxScore(int[] arr, int k) {
           int n=arr.length;
            int sum=0;
            int max=0;
            int i=0;
            int j=n-1;
            while(k>0)
            {
                if(arr[i]>arr[j])
                {
                    sum+=arr[i];
                    i++;
                }
                else if(arr[i]==arr[j])
                {
                    sum+=arr[i];
                    i++;
                    j++; 
                }
                else if(arr[i]<arr[j])
                {
                    sum+=arr[j];
                    j--;
                }
                 k--;
            }
           
            return max;
        }
        public static void main(String args[])
        {
            int arr[]={1,2,3,4,5,6,1};
            maxScore(arr,3);
        }
    } 

