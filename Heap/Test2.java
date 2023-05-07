package Heap;

import java.util.PriorityQueue;
import java.util.Map;
import java.util.HashMap;

public class Test2
{
    public static void main (String[] args)
    {
        int n = 2;

        PriorityQueue <Map.Entry<Integer,Integer>> l = new PriorityQueue <> (n,(a,b)->Integer.compare(a.getKey(),b.getKey()));
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,90);
        map.put(7,54);
        map.put(2,99);
        map.put(4,88);
        map.put(9,89);
      
        l.addAll(map.entrySet());
     
        while(l.size()>0)
        {
            System.out.println(l.poll().getValue());
        }
    }
}