class Solution {
    int[] nums;
    int n;
    int answer = 0;
    
    public int solution(int[] nums) {
        this.nums = nums;
        n = nums.length;
        comb(0, 0, 0);
        return answer;
    }
    
    boolean isPrime(int n){
        if(n<2){
            return false;
        }
        
        for(int i=2; (long) i*i <= n; i++){
            if(n%i == 0){
                return false;
            }
        }
        
        return true;
    }
    
    void comb(int start, int depth, int sum) {
        if (depth == 3) {
            if (isPrime(sum)){
              answer++;  
            } 
            return;
        }
        for (int i = start; i < n; i++) {
            comb(i + 1, depth + 1, sum + nums[i]);
        }
    }
}