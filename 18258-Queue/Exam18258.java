import java.util.*;
import java.io.*;

public class Exam18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<String> queue = new LinkedList<>();
        StringBuilder out = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        String back = "";
        for(int i = 0; i < N; i++) {
            StringTokenizer sk = new StringTokenizer(br.readLine());
            String cmdAndValue = sk.nextToken();
            
            switch(cmdAndValue) {
                case "push" :
                    cmdAndValue = sk.nextToken();
                    back = cmdAndValue;
                    queue.offer(cmdAndValue);
                    break;
                case "pop" :
                    out.append(queue.isEmpty() ? "-1" : queue.poll()).append("\n");
                    break;
                case "size" :
                    out.append(queue.size() + "\n");
                    break;
                case "empty" :
                    out.append(queue.isEmpty() ? "1" : "0").append("\n");
                    break;
                case "front" :
                    out.append(queue.isEmpty() ? "-1" : queue.peek()).append("\n");
                    break;
                case "back" :
                    out.append(queue.isEmpty() ? "-1" : back).append("\n");
            }
        }        
        System.out.print(out);
    }
}