import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] target = new int[commands.length];
        int col = 0;
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        for(int a=0; a<commands.length; a++){
            i = commands[a][0]-1;
            j = commands[a][1]-1;
            k = commands[a][2]-1;
            int length = j-i+1;
            
            int[] temp = new int[length];
            
            for(int b=0; b<length; b++){
                temp[b] = array[b+i];
            }
            Arrays.sort(temp);
            target[col] = temp[k];
            col++;
        }
        
        return target;
    }
}