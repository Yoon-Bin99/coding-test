class Solution {
    public int solution(int n) {
        return nextNum(n);
    }
    
    int checkOne(int n){
        int count = 0;
        
        while(n/2 != 0){
            if(n%2 == 1){
                count++;
            }
            n = n/2;           
        }
        
        return count;
    }
    
    int nextNum(int n){
        int count = checkOne(n);
        int next = n;
        
        while(true){
            next++;
            
            if(count == checkOne(next)){
                return next;
            }
        }
    }
}