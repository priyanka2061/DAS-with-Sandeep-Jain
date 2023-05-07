package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncFactory;

public class ListRepresentation {
    /**
     * @param v
     * @param e
     * @param arr
     */
    static void structure(int v,int e, List<int[]>arr)
    {
    
    }
    /**
     * @param args
     */
    public static void main (String args[])
    {
        int e=6;
        int n=5;
        Scanner sc=new Scanner(System.in);
        List<List<Integer>>arr=new ArrayList<>(5);
        for(int i=0;i<n;i++)
        {
          List<Integer>temp=new ArrayList<>();
          System.out.println("enater two node");
          
          int v1=sc.nextInt();
          int v2=sc.nextInt();
          arr.get(v1).add(v2);
          arr.get(v2).add(v1);

        }
    }
}
/*
 * List<int[]>a=new ArrayList<>();
 * a.get(3)[0]=5;
 * a.get(5)[0]=3;
 */