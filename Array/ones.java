package Array;
public class ones {
    public  void update(int a[], int n, int updates[], int k)
    {
        int j=1;
        int i=n;
        int p=updates[j];
        while(k>0 ||(p<=n))
        {
            if(k<0)
            break;
            if(i>=updates[j])
            {
                a[p]=a[p]+1;
                p++;
            }
            else
            {
                a[p]=a[p]+1;
                p++;
            }
            if(p==n && i==1)
            {
                 j++;
              p=updates[j];
              k--;
                
            }
            else
            {
               i--;
               j++;
              p=updates[j];
              k--;
            }
        }
    }
    public static void main (String args[])
    {
        int updates[]={1 ,1 ,2, 3};
        int N=3;
        int K=4;
        int a[]={0,0,0};
        ones obj=new ones();
        obj.update(a,N,updates,K);
    }
    
}

