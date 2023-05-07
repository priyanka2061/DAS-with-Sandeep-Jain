package contest;

public class randquery {
    public static  void rangeAddQueries(int n, int[][] queries) {
        
    
        int mat[][]=new int[n][n];
          int i=0;
          int j=0;
          int size=queries.length;
          int p=0;
          while(size>0)
          { 
              i=queries[p][0];
               j=queries[p][1];
             while(i<=queries[p][2])
             {
               mat[i][j]+=1;
                 j++;
              if(j>queries[p][3])
              {
                 j=queries[p][1];
                  i++;
              }
                 
             }
             p++;
              size--;
          }
        //   return mat;
        for(int k=0;k<mat.length;k++)
       {
        for( j=0;j<n;j++)
        {
            System.out.print(mat[k][j]+ " ");
        }
        System.out.println();
       }
      }
      public static void main (String args[])
      {
        int a[][]={{1,1,2,2},{0,0,1,1}};
        int n=3;
       rangeAddQueries( n,  a);
       
      }
}
