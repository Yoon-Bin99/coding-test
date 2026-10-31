import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Set<String> set = new HashSet<>();
        
        for(String s : report){
            set.add(s);
        }
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String r : set){
            String[] split = r.split(" ");
            map.put(split[1], map.getOrDefault(split[1], 0) + 1);
        }
        
        Map<String, Integer> idx = new HashMap<>();
        
        for(int i=0; i<id_list.length; i++){
            idx.put(id_list[i], i);
        }
        
        int[] answer = new int[id_list.length];
        
        for(String t : set){
            String[] p = t.split(" ");
            if(map.get(p[1]) >= k){
                answer[idx.get(p[0])] += 1;
            }
        }
        
        return answer;
    }
    
    
}