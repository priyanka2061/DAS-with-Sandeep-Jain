package BinarySearch;

public class Median {
    public int  find(int arr[],int arr2[],int n,int m)
    {
        int i=0;
        int j=0;
        int count=0;
        int value=0;
        int med=0; 
        int size=m+n; 
        if((size)%2==0)
        {
            med=((size)/2+(size+1/2))/2;
        }      
        else
        {
            med=(size+1)/2;
        }
        while(i<n && j<m)
        {
           if(arr[i]>=arr2[j])
           {
            count++;
            value=arr[j];
            j++;
           }
           else
           {
            count++;
            value=arr[i];
            i++;
           }
           if(count==med)
           {
            return value;
           }
        }
        return -1;
        
    } 
    public static void main(String args[])
    {
        Median obj=new Median();
        int arr[]={1,2,6,7};   // 1 2 3 4 4 5 5 6 7 8
        int arr2[]={3,4,5,8};
        System.out.println(obj.find(arr,arr2,6,4));   
    }
}
