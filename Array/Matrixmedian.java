package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Matrixmedian {
    
      

//User function Template for Java

    static int median(int matrix[][], int R, int C) {
        
            // code here 
           int size=R*C;
         
           int mid=(int)Math.ceil(size/2.0);
          
           ArrayList<Integer>arr=new ArrayList<>();
           for(int i=0;i<R;i++)
           {
                 int j=0;
               while( j<C && matrix[i][j]<=mid)
               {
                   arr.add(matrix[i][j]);
                   j++;
               }
              
           }
           Collections.sort(arr);
           return arr.get(mid-1);
    }
        
    
   

// 1 2 2 3 4 4 4 5 5 5 5 5 6 6 6 7 7 8 8 8 8 8 9 9 9 43 43 
        public static void main (String args[])
        {
            int mat[][]={{1,0,8} ,
                {2,4,6},
               {3,1,7}};
               int c=3;
               int r=3;
               System.out.println(median(mat, r,c));
        }
    }    

