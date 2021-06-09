import java.util.*;
//    https://deftkang.tistory.com/55 -> nextLine 에러 관련
class Exam10828 {   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        int isInData = 0;
        String N = input.nextLine();
        int K = Integer.parseInt(N);
        
        Stack<String> command = new Stack<>();
        
        for(int i = 0; i < K; i++) {
            
            str = input.nextLine();
            
            switch(str.substring(0,2)) {
                case "pu" :
                    command.push(str.substring(5));
                    isInData++;
                    break;
                case "po" :
                    if(isInData > 0) {
                        System.out.println(command.pop());
                    } else {
                        System.out.println("-1");
                    }
                    break;
                case "si" :
                    System.out.println(command.size());
                    break;
                case "em" :
                    if(command.empty() == true) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                case "to" :
                    if(command.empty() == true) {
                        System.out.println(-1);
                    } else {
                        System.out.println(command.peek());
                    }
            }
        }
    }
}