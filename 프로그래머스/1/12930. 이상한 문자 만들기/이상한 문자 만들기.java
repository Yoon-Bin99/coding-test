class Solution {
    public String solution(String s) {
        
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ", -1);
        
        for(int i=0; i<arr.length; i++){
            String t = arr[i];
            
            for(int j=0; j<arr[i].length();j++){
                char c = arr[i].charAt(j);
                if(isEven(j)){
                    c = Character.toUpperCase(c);
                    sb.append(String.valueOf(c));
                }else{
                    c = Character.toLowerCase(c);
                    sb.append(c);
                }
            }
            sb.append(" ");
        }
        String answer = sb.toString();
        int len = answer.length();
        answer = answer.substring(0, len-1);
        return answer;
    }
    
    boolean isEven(int i){
        return i%2==0;
    }
}