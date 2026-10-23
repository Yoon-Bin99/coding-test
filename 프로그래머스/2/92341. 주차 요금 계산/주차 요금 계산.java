import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int d_minute = fees[0];
        int d_fee = fees[1];
        int u_minute = fees[2];
        int u_fee = fees[3];
        
        int[] intime = new int[10000];
        int[] total = new int[10000];
        boolean[] seen = new boolean[10000];
        
        Arrays.fill(intime, -1);
        
        for(String s : records){
            String[] p = s.split(" ");
            String[] t = p[0].split(":");
            int h = Integer.parseInt(t[0]);
            int m = Integer.parseInt(t[1]);
            int time = h*60 + m;
            
            int num = Integer.parseInt(p[1]);
            String type = p[2];
            
            seen[num] = true;
            
            if(type.equals("IN")){
                intime[num] = time;
            }else{
                total[num] += time - intime[num];
                intime[num] = -1;
            }
        }
        
        int end = 23*60 + 59;
        for(int num=0; num<10000; num++){
            if(intime[num] != -1){
                total[num] += end - intime[num];
            }
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<10000; i++){
            if(!seen[i]){
                continue;
            }
            
            int fee;
            if(total[i] <= d_minute){
                fee = d_fee;
            }else{
                int extra = total[i] - d_minute;
                int units = (extra + u_minute - 1) / u_minute;
                fee = d_fee + units*u_fee;
            }
            list.add(fee);
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
                
        return answer;
    }
}