
import java.util.LinkedList;
import java.util.Queue;

class Pair {
    Integer row;
    Integer col;

    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

public class orange {
    public static void floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        int row_index[] = { -1, 0, +1, 0 };
        int col_index[] = { 0, +1, 0, -1 };
        int startclor = image[sr][sc];
        // int[][] visited = new int[n][m];
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(sr, sc));
       
        image[sr][sc] = color;
        // visited[sr][sc] = color;
        while (!q.isEmpty()) {
            int x = q.peek().row;
            int x2 = q.peek().col;
            q.poll();
            for (int i = 0; i < 4; i++) {
                int r = x + row_index[i];
                int c = x2 + col_index[i];
                if (r >= 0 && c >= 0 && r < n && c < m && image[r][c] == startclor) {
                    // visited[r][c] = color;
                    q.add(new Pair(r, c));
                    image[r][c] = color;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(image[i][j]+" ");
            }
            System.out.println();
        }
    }



    public static void main(String args[]) {
        int grid[][] = { { 1,1,1 }, { 1, 1, 0 }, { 1,0, 1 } };
        floodFill(grid,1,1,2);
    }

}
