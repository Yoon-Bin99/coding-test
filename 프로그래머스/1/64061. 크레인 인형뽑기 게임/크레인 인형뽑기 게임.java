import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> pick = new ArrayList<>();

        for (int x : moves) {
            int col = x - 1;

            for (int i = 0; i < board.length; i++) {        
                if (board[i][col] != 0) {
                    int doll = board[i][col];
                    board[i][col] = 0;                       

                    if (!pick.isEmpty() && pick.get(pick.size() - 1) == doll) {
                        pick.remove(pick.size() - 1);
                        answer += 2;
                    } else {
                        pick.add(doll);
                    }
                    break;                                   
                }
            }
        }
        return answer;
    }
}