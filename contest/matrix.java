public class matrix {
    
        static  public void  sortTheStudents(int[][] score, int k) {
            int max=0;
            int index=0;
            int l=0;
            int n=score.length;
            for(int i=0;i<n;i++)
            {
                for(int j=l;j<n;j++)
                {
                    if(max<score[j][k])
                    {
                        max=score[j][k];
                        index=j;
                    }
                }
               
                
                for(int p=0;p<score[0].length;p++)
                {
                    int temp=score[l][p];
                    score[l][p]=score[index][p];
                    score[index][p]=temp;
                    
                    
                }
                l++;
            }
            // return score;
           
        }
        public static void main (String args[])
        {
            int[][] s={ {10,6,9,1},{7,5,11,2},{4,8,3,15}};
            int k=2;
            sortTheStudents(s, k);
        }
    }

