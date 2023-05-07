package Graph;

import java.util.LinkedList;
import java.util.Queue;

class tuple {
    int max;
    int row;
    int col;

    /**
     * @param max
     */
    tuple(int max ,int row, int col) {
        this.max = max;
        this.row = row;
        this.col = col;
    }
}

public class Heights {
    public int minimumEffortPath(int[][] heights) {
        int d[][] = { { 1, 0 }, { -1, 0 }, { 0, -1 }, { 0, 1 } };

        int n = heights.length;
        int m = heights[0].length;
        if (n == 1)
            return heights[0][0];
        int diff[][] = new int[n][m];
        Queue<tuple> q = new LinkedList<>();
        q.add(new tuple(heights[0][0],0,0));
        int min = Integer.MAX_VALUE;
     
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                diff[i][j] = (int) (1e7);
            }
        }
        diff[0][0] = heights[0][0];
        while (!q.isEmpty()) {
            int row = q.peek().row;
            int col = q.peek().col;
            int max = q.peek().max;
            q.poll();
            for (int arr[] : d) {
                int x = row + arr[0];
                int y = col + arr[1];
                if (x == n - 1 && y == m - 1) {
                    min = Math.min(min, max);
                }
                if (x >= 0 && y >= 0 && x < n && y < m && diff[x][y] > Math.abs(heights[x][y] - heights[row][col])) {
                    int c = 0;
                    c = max < Math.abs(heights[x][y] - heights[row][col]) ? Math.abs(heights[x][y] - heights[row][col])
                            : max;
                    diff[x][y] = Math.abs(heights[x][y] - heights[row][col]);
                    q.add(new tuple(c, x, y));
                }
            }
        }
        return min;
    }
    public static void main (String args[])
    {
        int heights[][] = {{1,2,2},{3,8,2},{5,3,5}};
        Heights h = new Heights();
        System.out.println(h.minimumEffortPath(heights));
    }
}
