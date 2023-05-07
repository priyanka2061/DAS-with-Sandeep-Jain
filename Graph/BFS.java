package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
    static List<Integer>res=new ArrayList<>();
static void DepthFirstSearch(ArrayList<ArrayList<Integer>>list,int v,int e,int start, int[] visited)
{
   visited[start]=1;
    res.add(start);
    for(int i=0;i<list.get(start).size();i++)
    {
        int x=list.get(start).get(i);
        if(visited[x]!=1)
        DepthFirstSearch(list,v,e,x,visited);
    }

   
}
static void BreadthFirstSearch(ArrayList<ArrayList<Integer>>list,int v,int e,int start)
    {
        int[] visited=new int [v+1]; 
        Queue<Integer>q=new LinkedList<>();
        q.add(start);
        visited[start]=1;
        while(!q.isEmpty())
        {
            int k=q.poll();
           System.out.print(k+ " ");
           for(int i=0;i<list.get(k).size();i++)
           {
            if(visited[list.get(k).get(i)]!=1)
            {
             q.add(list.get(k).get(i));
            visited[list.get(k).get(i)]=1;
            }
           }

        }
    }
    public static void main(String args[])
    {
         int v=7;
        int e=7;
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
         for(int i=0;i<=v;i++)
         {
            list.add(new ArrayList<>());
         }
         Scanner obj=new Scanner(System.in);
        while(e>0)
        {
          System.out.println("enter two number");
           int n=obj.nextInt();
           int n1=obj.nextInt();
           list.get(n).add(n1);
           list.get(n1).add(n);
            e--;
        }
        BreadthFirstSearch(list,v,e,3);
        int[] visited=new int [v+1];
        DepthFirstSearch(list,v,e,3,visited);
        System.out.println();
        for(Integer i:res)
        {
            
            System.out.print(i+" ");
        }
    }
}
