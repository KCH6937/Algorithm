import java.util.*;
import java.io.*;

public class Exam2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> d = new ArrayDeque<>();
        
        int N = Integer.parseInt(br.readLine());
        int rear = 0;
        
        for(int i = 1; i <= N; i++) {
            d.addFirst(i);            
        }
        
        while(true) {
            if(d.size() == 1) {
                break;
            } else {
                d.removeLast();
                rear = d.removeLast();
                d.addFirst(rear);
            }
        }
        System.out.print(d.remove());
        
    }
}