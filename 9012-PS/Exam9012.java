import java.io.*;

public class Exam9012 {
    
    private static final char parLeft = '(';
    
    public static String YesOrNo(String parenthesis) {
        String result;
        int judge = 0;
        
        char[] divParhs = parenthesis.toCharArray();
        for(char o : divParhs) {
            if(o == parLeft) {
                judge++;
            } else {                
                judge--;
            }
            if(judge < 0) {
                result = "NO";
                break;
            }
        }
        if(judge == 0) {
            result = "YES";
        } else {
            result = "NO";
        }
        return result;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder out = new StringBuilder();    

        String parenthesis;
        for(int i = 0; i < T; i++) {
            parenthesis = br.readLine();
            out.append(YesOrNo(parenthesis) + "\n");
        }
        System.out.println(out);
    }    
}