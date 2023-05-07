package Heap;

public class insertionnode {
    static void build (int arr[],int k,int i)
    { int p=i;
       while(i>0)
       {
        if(k>arr[(i-1)/2])
        {
            int tamp=arr[(i-1)/2];
            arr[(i-1)/2]=arr[i];
            arr[i]=tamp;
        }
        i=(i-1)/2;
       }
    }
    public static void main (String args[])
    {
        int arr[]={3,5,2,8,9,8};
        for(int i=0;i<arr.length;i++)
        {
            build(arr,arr[i],i);
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
