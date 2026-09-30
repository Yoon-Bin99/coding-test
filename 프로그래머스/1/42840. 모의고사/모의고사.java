import java.util.*;

class Solution {
    public int[] solution(int[] answers) {        
        int[][] patterns = {
            {1,2,3,4,5},
            {2,1,2,3,2,4,2,5},
            {3,3,1,1,2,2,4,4,5,5}       
        };
        
        int[] score = new int[3];
        
        for(int i=0; i<answers.length; i++){
            for(int j=0; j<3; j++){
                if(patterns[j][i%patterns[j].length]==answers[i]){
                    score[j]++;
                }
            }
        }
        
        int max = Math.max(score[0], Math.max(score[1], score[2]));
        
        List<Integer> list = new ArrayList<>();
        
        for(int k=0; k<3; k++){
            if(score[k]==max){
                list.add(k+1);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int a=0; a<list.size(); a++){
            answer[a] = list.get(a);
        }
        
        return answer;
    }
}