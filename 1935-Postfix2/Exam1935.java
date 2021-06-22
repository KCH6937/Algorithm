import java.io.*;
import java.util.*;

public class Exam1935 {
    private static final int A = 65;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Float> stack = new Stack<>();
        
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int size = input.length();
        
        char[] divStr = input.toCharArray();
        int[] value = new int[N];
        int j = 0;
        float popValue1 = 0, popValue2 = 0;
        
        
        for(int i = 0; i < N; i++) {
            value[i] = Integer.parseInt(br.readLine());
        }
        
        int temp = value[0];
        
        for(int i = 0; i < size; i++) {
            int judge = divStr[i];            
            if(judge >= A && judge < A + N) {                
                temp = temp == judge ? value[j] : value[j < (N-1) ? j++: j];
                stack.push((float)temp);            
            } else {            
                popValue1 = stack.pop();
                popValue2 = stack.pop();
                
                switch(divStr[i]) {
                    case '+' :                        
                        stack.push(popValue2 + popValue1);
                        break;
                    case '-' :
                        stack.push(popValue2 - popValue1);
                        break;
                    case '*' :
                        stack.push(popValue2 * popValue1);
                        break;
                    case '/' :                        
                        stack.push(popValue2 / popValue1);
                }                
            }
        }
        
        System.out.format("%.2f", stack.pop());
    }
}