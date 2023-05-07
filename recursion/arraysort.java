public class arraysort {
    static void sort(int arr[], int index)
    {
        if(index>=arr.length)
           return;
         for(int i=index;i<arr.length;i++)  // implemented  0(n*2) because call code 0(n)time * n time of operation is using
         {
           if(arr[index]>arr[i])
           {
             int temp=arr[index];  // process of selection sort
             arr[index]=arr[i];
             arr[i]=temp;
           }
         }  
         sort(arr,index+1);                                                                                                                            
    }
    public static void main(String args[])
    {
        int arr[]={10,3,2,8,2,1,0};      // space complexity is 0(n)
        sort(arr,0);
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }
    
}
