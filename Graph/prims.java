package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

class Tuple
{
    int w;
    int node;
    int parent;
    Tuple(int w,int node,int parent)
    {
        this.w=w;
        this.node=node;
        this.parent=parent;
    }
}
public class prims {
	static int spanningTree(int V, int E, int edges[][]){
	    int sum=0;
	    ArrayList<ArrayList<int[]>>adj=new ArrayList<>();
	    for(int i=0;i<V;i++)
	    {
	        adj.add(new ArrayList<>());
	    }
	    for(int i=0;i<E;i++)
	    {
	        int node=edges[i][0];
	        int w=edges[i][2];
	        int destination=edges[i][1];
	        adj.get(node).add(new int[]{destination,w});
	        adj.get(destination).add(new int[]{node,w});
	    }
	  
	    int visited[]=new int[V];
	      visited[0]=1;
	    PriorityQueue<Tuple>pq=new PriorityQueue<>((x,y)->x.w-y.w);
	    pq.add(new Tuple(0,0,-1));
	    while(!pq.isEmpty())
	    {
	        int weight=pq.peek().w;
	        sum+=weight;
	        int node=pq.peek().node;
	        int parent=pq.peek().parent;
	        pq.poll();
	        for(int arr[]:adj.get(node))
	        {
	            if(visited[arr[1]]!=1)
	            {
	                pq.add(new Tuple(weight+arr[1],arr[0],parent));
	            }
	        }
	        
	    }
	    return sum;
	}
    public static void main (String args[])
    {
        int V=5;
        int E=7;
        int edges[][]={{0,1,2},{0,3,6},{1,2,3},{1,3,8},{1,4,5},{2,4,7},{3,4,9}};
        System.out.println(spanningTree(V,E,edges));
    }
}


