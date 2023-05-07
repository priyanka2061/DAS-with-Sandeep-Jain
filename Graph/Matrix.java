package Graph;
class Matrix{
    static int dfs(int[][] mat, int i, int j) {
        int n = mat.length;
        int m = mat[0].length;
        int[] row_index = {0, 0, -1, 1};
        int[] col_index = {1, -1, 0, 0};
        if (mat[i][j] == 0) {
            return Integer.MAX_VALUE;
        }
        int minDist = Integer.MAX_VALUE;
        for (int k = 0; k < 4; k++) {
            int x = i + row_index[k];
            int y = j + col_index[k];
            if (x >= 0 && y >= 0 && x < n && y < m) {
                int dist = dfs(mat, x, y);
                minDist = Math.min(minDist, dist);
            }
        }
        return minDist == Integer.MAX_VALUE ? 1 : minDist + 1;
    }
    
    static public void updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int dis=-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]!=0)
                {
                  dis= dfs(mat,i,j);
                  mat[i][j]=dis;

                }
            }
        }
       
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int  mat[][] = {{0,0,0},{0,1,0},{1,1,1}};
         updateMatrix( mat);
    }
}