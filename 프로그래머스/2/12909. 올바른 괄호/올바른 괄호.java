class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int left = 0;
        int right = 0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                left++;
            }else{
                if(left == 0){
                    answer = false;
                    break;
                }
                
                right++;
            }
            
            if(right > left){
                answer = false;
            }
        }
        
        if(left != right){
            answer = false;
        }

        return answer;
    }
}