import java.io.*;
import java.util.*;
// 1748 start
public class Exam1935 {
    //private static final char[] operator = {'+', '-', '*', '/'};
    private static final int A = 65;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int size = input.length();
        
        char[] divStr = input.toCharArray();
        int[] value = new int[N];
        float answer = 0;
        
        for(int i = 0; i < N; i++) {
            value[i] = Integer.parseInt(br.readLine());
        }
        
        for(int i = 0; i < size; i++) {
            int judge = divStr[i];
            int j = 0;
            float popValue,popValue2;
            if(judge >= A && judge < A + N) {
                stack.push(value[j++]);
            } else {                
                popValue = stack.pop();
                popValue2 = stack.pop();
                stack.push(0);
                switch(divStr[i]) {
                    case '+' :
                        answer += popValue2 * popValue2;
                        break;
                    case '-' :
                        answer -= popValue2;
                        break;
                    case '*' :
                        answer *= popValue2;
                        break;
                    case '/' :                        
                        answer /= popValue2;
                }                
            }
        }
        System.out.format("%.2f \n", answer);
    }
}