import java.util.*;

public class sort {
    static void insert(ArrayList<Integer>a,int n)
    {
        if(a.size()==0 || a.get(a.size()-1)<n)
        {
         a.add(n);
         return;
        }
        int m=a.get(a.size()-1);
        a.remove(a.size()-1);
        insert(a,n);
        a.add(m);
        return;
    }
    static void sort(ArrayList<Integer>a)
    {
        if(a.size()==1)
        return;
        int n=a.get(a.size()-1);
        a.remove(a.size()-1);
        sort(a);
        insert(a,n);
        return;
       
    }
    
    public static void main (String args[])
    {
        // int arr[]={10,3,2,8,2,1,0};
        ArrayList<Integer>a=new ArrayList<>(List.of(10,3,2,8,2,1,0));
         sort(a);
        for(int i:a)
        {
            System.out.println(i);
        }
    }
    
}
