class Solution {
    int target;
    int[] numbers;
    int count = 0;
    
    public int solution(int[] numbers, int target) {
        this.target = target;
        this. numbers = numbers;
        
        dfs(0,0);        
        
        return count;
    }
    
    void dfs(int idx, int sum){
         if (idx == numbers.length) {
            if (sum == target) count++;
            return;
        }
        dfs(idx + 1, sum + numbers[idx]);
        dfs(idx + 1, sum - numbers[idx]);
    }
}