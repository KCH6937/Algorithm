import java.util.Scanner;
import java.util.*;

class Exam1158 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        int slot = -1;
        int count = 0;
        
        List<Integer> list = new LinkedList<Integer>();
        
        for(int i = 1; i <= N; i++) {
            list.add(i);
        }
        
        System.out.print("<");
        while(list.size() > 0) {
            slot++;
            count++;
            if(slot >= list.size()) {
                slot = 0;
            }
            if(K == count) {
                if(list.size() == 1) {
                    System.out.print(list.get(slot));
                    break;
                }
                System.out.print(list.get(slot) + ", ");
                list.remove(slot);
                count = 0;
                slot -= 1;
            }        
        }
        System.out.print(">");
    }
}