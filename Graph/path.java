import java.util.Arrays;
import java.util.PriorityQueue;

class Pair
{
    int row;
    int col;
    int height;
    Pair(int row,int col,int height)
    {
        this.row=row;
        this.col=col;
        this.height=height;
    }
}
 public class path {
    int MinimumEffort(int heights[][]) {
        int n=heights.length;
        int m=heights[0].length;
        
        int[][] direction={{1,0},{-1,0},{0,1},{0,-1}};
        
        int diff[][]=new int [n][m];
        PriorityQueue<Pair>pq=new PriorityQueue<Pair>((a,b) -> a.height - b.height);
        
        for(int i[]:diff)
        {
            Arrays.fill(i,Integer.MAX_VALUE);
        }
        pq.add(new Pair(0,0,heights[0][0]));
        diff[0][0]=heights[0][0];
        while(!pq.isEmpty())                  
        {                                           
            Pair temp=pq.poll();
            
            for(int i=0;i<4;i++)
            {
                int r=temp.row+direction[i][0];
                int c= temp.col+direction[i][1];
                if(r>=0 && c>=0 && r<n && c<m)
                {
                    int d=Math.abs(heights[r][c]-heights[temp.row][temp.col]);
                     int max=Math.max(d,temp.height);
                    if(diff[r][c]>max)
                    {
                        diff[r][c]=max;
                         pq.add(new Pair(r,c,max));
                    }
                    
                 
                    }
                   
                }
            }
        
        return diff[n-1][m-1];
    }
    public static void main (String args[])
    {
        //5 5
// 1 2 1 1 1
// 1 2 1 2 1
// 1 2 1 2 1
// 1 2 1 2 1
// 1 1 1 2 1
// convert to 2d array
        int[][] heights ={{1 ,2 ,1 ,1, 1},{1 ,2 ,1 ,2 ,1},{1, 2,1, 2 ,1},{1, 2 ,1 ,2 ,1},{1 ,1 ,1 ,2 ,1}};
        path p=new path();
        System.out.println(p.MinimumEffort(heights));
    }
}