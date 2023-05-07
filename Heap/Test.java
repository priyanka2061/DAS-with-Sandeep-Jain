package Heap;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair>
{

	Integer key;
	Integer value;
	Pair(int key,int value)
	{
		this.key=key;
		this.value=value;
	}
	public int compareTo(Pair o) {
        return key - o.key;
}
}
public class Test
{
	
	
	public static void main (String args[])
	{
		int nums[]={5,6,7,8,9};
		int k=7;
		PriorityQueue<Pair>pq=new PriorityQueue<>(Collections.reverseOrder());
		// PriorityQueue<Pair<Integer,Integer> > pq=
        //             new PriorityQueue<Pair<Integer,Integer>>(n,(a,b) -> a.key() - b.key());
		for(int i=0;i<nums.length;i++)
		{
			pq.add(new Pair(Math.abs(nums[i]-k),nums[i]));
			if(pq.size()>3)
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