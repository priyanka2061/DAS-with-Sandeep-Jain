package Heap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
class Pair implements Comparable<Pair> {

    Integer key;
    Integer value;

    Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int compareTo(Pair o) {
        return key - o.key;
    }
}

    

public class topfreuency {
    /**
     * @param args
     */
    public static void main (String args[])
    {
        int arr[]={1,1,1,2,2,3,3,3,4};
        int k=2;
        Map<Integer,Integer>map=new HashMap<>();
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            pq.add(new Pair(entry.getValue(),entry.getKey()));
            if(pq.size()>k)
            {
                pq.remove();
            }
        }
        while(pq.size()>0)
        {
            System.out.println(pq.poll().value);
        }
        
    }
}
