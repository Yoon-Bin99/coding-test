import java.util.*;

class Solution {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    
    public int solution(int[][] maps) {
        int answer = 0;
        int n = maps.length;
        int m = maps[0].length;
        
        int result = bfs(maps, 0, 0, n - 1, m - 1);
        if (result == -1) return -1;
        answer = result + 1;
        
        return answer;
    }
    
    int bfs(int map[][], int sx, int sy, int ex, int ey){
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
            for(int d=0; d< 4; d++){
                int nx = x + dx[d];
                int ny = y + dy[d];
                
                if(nx<0 || ny<0 || nx>=n || ny>=m){
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