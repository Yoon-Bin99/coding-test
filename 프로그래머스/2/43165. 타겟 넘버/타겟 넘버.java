import java.util.*;

class Solution {
    
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        answer = dfs(numbers, 0, 0, target);
        
        return answer;
    }
    
    int dfs(int[] nums, int idx, int sum, int target){
        if(idx==nums.length){
            return sum == target ? 1 : 0;
        }
        return dfs(nums, idx + 1, sum + nums[idx], target)
         + dfs(nums, idx + 1, sum - nums[idx], target);
    }
}