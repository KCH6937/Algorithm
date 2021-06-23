import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[][] board, int[] moves) throws IOException {
       final int boardSize = board.length;
        final int moveSize = moves.length;
        
        Stack<Integer> stack = new Stack<>();
        
        int crain = 0;
        int postValue = 0;
        int answer = 0;
        
        for(int i = 0; i < moveSize; i++) {
            crain = moves[i];
            crain -= 1;
            for(int j = 0; j < boardSize; j++) {;
                if(board[j][crain] != 0) {
                    if(postValue == board[j][crain]) {
                        answer += 2;                        
                        stack.pop();
                        postValue = stack.empty() == true ? 0 : stack.peek();
                    } else {     
                        postValue = board[j][crain];
                        stack.push(board[j][crain]);
                    }
                    board[j][crain] = 0;
                    break;
                }
            }
        }                        
        return answer;
    }
}