import java.util.*;
import java.io.*;

class Exam10828 {   
    public static void main(String[] args) {
        FastReader fr = new FastReader();
        StringBuilder out = new StringBuilder();
        Stack<String> command = new Stack<>();
        
        int N = fr.nextInt();
        int isInData = 0;
        
        for(int i = 0; i < N; i++) {
            String str = fr.nextLine();
            
            switch(str.substring(0,2)) {
                case "pu" :
                    command.push(str.substring(5));
                    isInData++;
                    break;
                case "po" :
                    if(isInData > 0) {
                        out.append(command.pop() + "\n");
                        isInData--;
                    } else {
                        out.append("-1\n");
                    }
                    break;
                case "si" :
                    out.append(command.size() + "\n");
                    break;
                case "em" :
                    if(command.empty()) {
                        out.append("1\n");
                    } else {
                        out.append("0\n");
                    }
                    break;
                case "to" :
                    if(command.empty()) {
                        out.append(-1 + "\n");
                    } else {
                        out.append(command.peek() + "\n");
                    }
            }
        }
        System.out.print(out);
    }
    
    static class FastReader {
        BufferedReader br;
        StringTokenizer stk;
        
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        String next() {
            while(stk == null || !stk.hasMoreElements()) {
                try {
                    stk = new StringTokenizer(br.readLine());
                } catch(IOException e) {
                    e.printStackTrace();
                }                            
            }
            return stk.nextToken();
        }
        
        int nextInt() { return Integer.parseInt(next()); }
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch(IOException e) {
                e.printStackTrace();                
            }
            return str;
        }
    }
}