import java.io.*;
import java.util.*;

public class Exam1935 {
    public static boolean isAlphabet(char c) {
        int v = (int)c;
        if(v >= 65 && v <= 90) {
            return true;
        } else {
            return false;
        }
    }
    
    public static int indexIs(char c) {
        int first = 65;    // alphabet 'A'
        int index = (int)c - first;
        return index;
    }
    
    public static double calc(char c, double a, double b) {
        double ret = 0.d;
        switch(c) {
            case '*' :
                ret = a * b;
                break;
            case '+' :
                ret = a + b;
                break;
            case '/' :
                ret = a / b;
                break;
            case '-' :
                ret = a - b;
                break;
        }
        return ret;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Double> stack = new Stack<>();
        
        int N = Integer.parseInt(br.readLine());
        double[] value = new double[N];
        String line = br.readLine();
        
        char[] input = line.toCharArray();
        int size = line.length();
        int index = 0;
        double[] popValue = {0, 0};
        
        for(int i = 0; i < N; i++) {
            value[i] = Integer.parseInt(br.readLine());
        }
        
        for(int i = 0; i < size; i++) {
            if(isAlphabet(input[i]) == true) {
                index = indexIs(input[i]);
                stack.push((double)value[index]);
            } else {
                popValue[1] = stack.pop();
                popValue[0] = stack.pop();
                stack.push(calc(input[i], popValue[0], popValue[1]));
            }
        }
        System.out.format("%.2f",stack.pop());
    }
}