package lesson.chapter5;

import java.util.Scanner;
import java.util.Stack;

public class ch5_1 {
    public String solution(String s) {
        String answer = "YES";
        Stack<Character> stack=new Stack<>();
        for (char x : s.toCharArray()) {
            if(x == '(') stack.push(x);
            else {
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty())  return  "NO";
        return answer;
    }



    public static void main(String[] args) {
        ch5_1 T = new ch5_1();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(T.solution(s));
    }
}
