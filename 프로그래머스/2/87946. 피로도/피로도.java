class Solution {
    int[][] dungeons;
    boolean[] visited;
    int n;
    int answer = 0;

    public int solution(int k, int[][] dungeons) {
        this.dungeons = dungeons;
        n = dungeons.length;
        visited = new boolean[n];
	      perm(k, 0);
        return answer;
    }

    void perm(int hp, int depth) {
        answer = Math.max(answer, depth);   
        for (int i = 0; i < n; i++) {
            if (visited[i] || hp < dungeons[i][0]) continue;
            visited[i] = true;
            perm(hp - dungeons[i][1], depth + 1);
            visited[i] = false;
        }
    }
}