package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    static int res=0;
    static void solve(int arr[],int N,int K,int index,List<Integer>list)
   {
      
       if(index==N)
       {
           int p=0;
           for(int i:list)
           {
                p=p^i;
           }
           if(p==K)
           {
               res++;
           }
           return;
       }
   //   for(int i=0;i<n;i++)
   //   {
   //       if(arr[i]==arr[i+1])
   //                 continue;
   //   }
          list.add(arr[index]);
         solve(arr,N,K,index+1,list);
         list.remove(list.size()-1);
         solve(arr,N,K,index+1,list);     
      } 
       
   
   static int subsetXOR(int arr[], int N, int K) {
       // code here
    //    Arrays.sort(arr);
        List<Integer>list=new ArrayList<>();
       
       solve(arr,N,K,0,list);
       return res; 
   }

    public static void main(String args[]) {
        // Subset obj=new Subset();
        int arr[] = { 
            4 ,94 ,39, 36 ,88, 87 ,39 ,67 ,11, 6};
        int N = 10;
        int k = 15;
         subsetXOR(arr, N, k);
        System.out.println(res);
    }
}
