package Graph;

import java.util.ArrayList;

public class trio {
    void dfs(ArrayList<ArrayList<Integer>>adj, int visited[],int degree[], int dist[],int min[],int distance,int node,int parent,int count)
    {
       
        visited[node]=1;
        dist[node]=distance;
        if(degree[node]>=3)
        {
            count++;
           
        }
        for(int j:adj.get(node))
        {
            if(visited[j]!=1)
            {
        dfs(adj,visited,degree,dist,min,distance+1,j,node,count);
            }
            else if(j!=parent)
            {
    //  System.out.println(distance+ " "+ dist[j]+ " "+ j);
                if(Math.abs(distance-dist[j])+1==3)
                {
                    
                    min[0]=Math.min(min[0],count);
                }
            }
        }
    }
    public int minTrioDegree(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<=n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++)
        {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        int degree[]=new int[n+1];
        for(int i=1;i<=n;i++)
        {
           degree[i]=adj.get(i).size();
        }
        int visited[]=new int[n+1];
        int dist[]=new int[n+1];
        int min[]=new int[1];
        min[0]=Integer.MAX_VALUE;
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(visited[i]!=1)
            dfs(adj,visited,degree,dist,min,0,i,-1,count);
        }
        if(min[0]==Integer.MAX_VALUE)
         return -1;
        return min[0];
    } 
    public static void main (String args[])
    {
        int n=6;
        int edges[][]={{1,2},{1,3},{3,2},{4,1},{5,2},{3,6}};
        trio t=new trio();
         System.out.println(t.minTrioDegree(n,edges));
    }
}