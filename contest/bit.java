
    import java.util.ArrayList;
    public class bit {
     static public int distinctIntegers(int n) {
        
        int count=1;
        int j=0;
        int i=1;
        int x=n;
        ArrayList<Integer>arr=new ArrayList<>();
        while(i<=n && arr.size()>=0)
        {
            if(x%i==1)
            {
                arr.add(i);
                count++;
            }
            if(i==n)
            {
                if(arr.isEmpty())
                {
                    break;
                }
                i=1;
                x=arr.get(j);
                n=arr.get(j);
                arr.remove(j);
            }
            
            i++;
        }
        return count;
    }
    public static void main (String args[])
    {
        int n=5;
        System.out.println(distinctIntegers(5));
    }
}
// or this is good
/* 
 *   if there is n  chance of unique getting is n-1  5 -> 4 ->3->2 =(n-1)
 * 
 * if( n==1)
 * return 1  // 1%1=1;
 * 
 * return n>1 ?n-1:1; o(1) 
 */
