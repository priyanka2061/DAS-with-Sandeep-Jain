import java.util.* ;
import java.io.*; 
public class slide {

     static int position(List<Integer> arr,int low,int high)
    {
        int pivot=arr.get(low);
        int i=low+1;
        int j=high;
        do{
        if(arr.get(i)<=pivot)
        {
            i++;
        }
        if(arr.get(j)>pivot )
        {
            j--;
        }
        if(i<j)
        {
            int temp=arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
             i++;
             j--;
        }
        } while(i<j);
        
            int temp=arr.get(low);
            arr.set(low,arr.get(j));
            arr.set(j,temp);
        
    return j;
    }
     static void quicksort(List<Integer> arr,int low,int high)
    {
        if(low<high)
        {
            int p=position(arr,low,high);
             quicksort(arr,low,p-1);
              quicksort(arr,p+1,high);

        }
    }
    public static void  quickSort(List<Integer> arr){
       quicksort(arr,0,arr.size()-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            arr.add(sc.nextInt());
        }
        quickSort(arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr.get(i)+" ");
        }
    }
}