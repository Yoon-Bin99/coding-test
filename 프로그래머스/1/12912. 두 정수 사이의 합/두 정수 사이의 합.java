class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int temp = 0;
        
        if(a>b){
            temp = a;
            a = b;
            b = temp;
        }
        
        while(a!=b){
            answer += a;
            a++;
        }
        
        answer += b;
        
        return answer;
    }
}