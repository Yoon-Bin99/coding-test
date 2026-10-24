import java.util.*;

class Solution {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    public int[] solution(String[] park, String[] routes) {
        int n = park.length;
        int m = park[0].length();

        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (park[i].charAt(j) == 'S') {
                    x = i;
                    y = j;
                }
            }
        }

        for (String route : routes) {
            String[] parts = route.split(" ");
            int d = "NSWE".indexOf(parts[0].charAt(0));
            int cnt = Integer.parseInt(parts[1]);

            int nx = x, ny = y;
            boolean ok = true;
            for (int k = 0; k < cnt; k++) {
                nx += dx[d];
                ny += dy[d];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m || park[nx].charAt(ny) == 'X') {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                x = nx;
                y = ny;
            }
        }

        return new int[]{x, y};
    }
}