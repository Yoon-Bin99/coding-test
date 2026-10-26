import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        Map<String, Integer> termMap = new HashMap<>();
        for(String s : terms){
            String[] temp = s.split(" ");
            termMap.put(temp[0], Integer.parseInt(temp[1]));
        }
        
        int tday = toDay(today);
        
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<privacies.length; i++){
            String[] arr = privacies[i].split(" ");
            int collected = toDay(arr[0]);
            int month = termMap.get(arr[1]);
            int expireDay = collected + month*28;
            
            if(tday >= expireDay){
                list.add(i+1);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int j=0; j<list.size(); j++){
            answer[j] = list.get(j);
        }
        
        return answer;
    }
    
    int toDay(String date){
        String[] s = date.split("\\.");
        
        int year = Integer.parseInt(s[0]);
        int month = Integer.parseInt(s[1]);
        int day = Integer.parseInt(s[2]);
        
        return year*12*28 + month*28 + day;
    }
}