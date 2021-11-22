package lesson.chapter5;

import java.util.Scanner;
import java.util.Stack;

public class ch5_2 {
    public String solution(String s) {
        String answer = "";
        Stack<Character> stack=new Stack<>();
        for (char x : s.toCharArray()) {
            if(x == '(') stack.push(x);
            if(stack.isEmpty()) answer += x;
            if(x == ')') stack.pop();

        }
        return answer;
    }



    public static void main(String[] args) {
        ch5_2 T = new ch5_2();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(T.solution(s));
    }
}
