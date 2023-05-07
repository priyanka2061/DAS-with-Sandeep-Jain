package vertusa;

import java.util.ArrayList;
import java.util.List;

class Solution {
    static void dfs(char m[][], int[][] visited, List<String> mt, int r, int c,int f) {
        int dirow[] = { 0, 1 };
        int dircol[] = { 1, 0 };
        int n = m.length;
        int m1 = m[0].length;
        if (mt.contains(String.valueOf(m[r][c])) || f==0)
         {
            for (int i = 0; i < 2; i++) {
                int x = dirow[i]+r;
                int y = dircol[i]+c;

                if (x >= 0 && x < n && y >= 0 && y <= m1 && (mt.contains(String.valueOf(m[r][c])) || f==0 )&& visited[x][y] != 1 ) {
                    visited[x][y] = 1;
                    visited[r][c] = 1;
                    
                    if (mt.contains(String.valueOf(m[r][c])));
                        mt.remove(String.valueOf(m[r][c]));
                    mt.remove(String.valueOf(m[x][y]));
                    f=0;
                    dfs(m, visited, mt, x, y,f);
                }
            }

        }
    }

    public static boolean wordSearch(char m[][], String w) {
        List<String> mt = new ArrayList<>();
        for (int i = 0; i < w.length(); i++) {
            String st=String.valueOf(w.charAt(i));  
            mt.add(st);
        }
        int[][] visited = new int[m.length][m[0].length];
        if (mt.size() > 0)
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    if (visited[i][j] != 1) {
                        dfs(m, visited, mt, i, j,1);
                        if (mt.size() <= 0)
                            return true;
                    }
                }
            }
        return false;

    }

    public static void main(String args[]) {
        char m[][] = { { 'a' ,'b', 'c', 'd'},{ 'e' ,'f', 'g' ,'h' }, { 'i', 'j', 'k','l' }, { 'm' ,'n' ,'o' ,'p' } };
        String w = "bcgkjn";
        
        System.out.println(wordSearch(m, w));
    }
}
