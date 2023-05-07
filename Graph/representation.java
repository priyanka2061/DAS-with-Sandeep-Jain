package Graph;

import java.util.Scanner;

public class representation {
    static void structure(int v,int e,int[][] adj)
    {
        Scanner obj=new Scanner(System.in);
        while(e>0)
        {
            System.out.println("enter the edge");
            int n=obj.nextInt();
            int n2=obj.nextInt();
            adj[n][n2]=1;
            adj[n2][n]=1; 
            e--;           
        }
    }
    private static Scanner nextInt() {
        return null;
    }
    public static void main (String args[])
    {
        int v=8;
        int e=6;
        int adj[][]=new int[v+1][v+1];
        structure(v,e,adj);
    }
}
