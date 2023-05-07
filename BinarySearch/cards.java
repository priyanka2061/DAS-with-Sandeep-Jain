package BinarySearch;

import java.util.HashMap;
import java.util.Map;

public class cards {
    static  public int minimumCardPickup(int[] cards) {
        int i=0;
        int j=0;
        int min=Integer.MAX_VALUE;
        Map<Integer,Integer>map=new HashMap<>();
        while(i<=j && j<cards.length)
        {
        map.put(cards[j],map.getOrDefault(cards[j],0)+1);
        if(map.size()<j-i+1)
        {
          while(map.size()<j-i+1)
          {
            min=Math.min(min,j-i+1);
            if(map.containsKey(cards[i]))
            {
           map.put(cards[i],map.get(cards[i])-1);
               if(map.get(cards[i])==0)
               map.remove(cards[i]);
            }
            i++;
          }
        }
        j++;
        }
        if(min==Integer.MAX_VALUE)
        return -1;
        return min;
    }
    public static void main (String args[])
    {
        int card[]={3,4,2,3,4,7};
        minimumCardPickup(card);
    }
}