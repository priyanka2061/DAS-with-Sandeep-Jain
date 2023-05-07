package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

import queue.Priority;

public class sum_of_element {
   public static void main (String args[])
   {
    int arr[]={1,3,12,5,11,15};
    int k1=3;
    int k2=6;
    PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
    for(int i=0;i<arr.length;i++)
    {
        pq.add(arr[i]);
      if(pq.size()>k2)
      {
        pq.remove();
      }
    }
    int last=pq.peek();
    while(pq.size()>k1)
    {
        pq.remove();
    }
    int first=pq.peek();
    int rangesum=0;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>first && arr[i]<last)
        {
          rangesum+=arr[i];
        }
    }
    System.out.println(rangesum);
   } 
}
