import java.util.*;

class Solution {
    boolean[] visited;
    int n;
    int[][] computers;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        this.n = n;
        this.computers = computers;
        visited = new boolean[n];
        
        for(int i=0; i<n; i++){
            if(!visited[i]){
                dfs(i);
                answer++;
            }
        }
        
        return answer;
    }
    
    void dfs(int node){
        visited[node] = true;
        for(int next=0; next<n; next++){
            if(computers[node][next]==1 && !visited[next]){
                dfs(next);
            }
        }
    }
}