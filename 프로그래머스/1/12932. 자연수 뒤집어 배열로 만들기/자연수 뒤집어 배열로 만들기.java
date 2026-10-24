import java.util.*;

class Solution {
    public int[] solution(long n) {
        int length = String.valueOf(n).length();
        int[] answer = new int[length];
        
        long r = 0;
        long q = n;
        
        for(int i=0; i<length; i++){
            r = q%10;
            q = q/10;
            answer[i] = (int) r;
        }
        
        return answer;
    }
}