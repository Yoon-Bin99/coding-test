class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int big = 0;
        int small = 0;
        int max_w = 0;
        int max_h = 0;
        
        for(int i=0; i<sizes.length; i++){
            big = Math.max(sizes[i][0], sizes[i][1]);
            small = Math.min(sizes[i][0], sizes[i][1]);
            
            max_w = Math.max(max_w, big);
            max_h = Math.max(max_h, small);
        }
        
        answer = max_w * max_h;
        
        return answer;
    }
}