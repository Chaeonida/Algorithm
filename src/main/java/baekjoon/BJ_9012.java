package baekjoon;



import java.util.Scanner;
import java.util.Stack;

public class BJ_9012 {
    public String solution(String s) {
        String answer = "YES";
        Stack<Character> stack=new Stack<>();
        for (char x : s.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else {
                if(stack.empty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.empty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        BJ_9012 T = new BJ_9012();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for (int i = 0; i < n; i++) {
            String s = kb.next();
            System.out.println(T.solution(s));

        }

    }
}