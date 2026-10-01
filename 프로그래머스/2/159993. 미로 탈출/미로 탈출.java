import java.util.*;

class Solution {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    
    public int solution(String[] maps) {
        int n = maps.length;
        int m = maps[0].length();
        int[][] map = new int[n][m];
        
        int sx = 0;
        int sy = 0;
        int lx = 0;
        int ly = 0;
        int ex = 0;
        int ey = 0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                char c = maps[i].charAt(j);
                
                map[i][j] = (c == 'X') ? 0 : 1;
                
                if(c == 'S'){
                    sx = i;
                    sy = j;
                }else if(c == 'L'){
                    lx = i;
                    ly = j;
                }else if(c == 'E'){
                    ex = i;
                    ey = j;
                }
            }
        }       
        
        int toLever = bfs(map, sx, sy, lx, ly);
        if(toLever == -1){
            return -1;
        }
        
        int toEnd = bfs(map, lx, ly, ex, ey);
        if(toEnd == -1){
            return -1;
        }
        
        return toLever + toEnd;
    }
    
    int bfs(int[][] map, int sx, int sy, int ex, int ey){
        int n = map.length;
        int m = map[0].length;
        int[][] dist = new int[n][m];
        
        for(int[] row : dist){
            Arrays.fill(row, -1);
        }
        
        Deque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{sx, sy});
        dist[sx][sy] = 0;
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            
            if(x==ex && y==ey){
                return dist[x][y];
            }
            
            for(int d=0; d<4; d++){
                int nx = x + dx[d];
                int ny = y + dy[d];
                
                if(nx<0 || ny<0 || nx >=n || ny>=m){
                    continue;
                }
                
                if(map[nx][ny]==0 || dist[nx][ny]!=-1){
                    continue;
                }
                
                dist[nx][ny] = dist[x][y] + 1;
                q.offer(new int[]{nx, ny});
            }
        }
        return -1;
    }
}