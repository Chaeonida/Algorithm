

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public int solution(String s) {
        int answer = 0 ;
        Stack<Integer> stack=new Stack<>();
        String[] str = s.split(" ");
        if (str[0] == "push") stack.push(Integer.parseInt(str[1]));
        if (str[0] == "top") {
            if(stack.empty()) return -1;
            answer = stack.peek();
        }
        if (str[0] == "pop") {
            if(stack.empty()) return -1;
            answer = stack.pop();
        }
        if (str[0] == "empty") {
            if(stack.empty()) return 1;
            else answer = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = 5;
        String s = " ";
        int a = 0;
        for (int i = 0; i < n; i++) {
            s = kb.next();
            System.out.println(T.solution(s));
        }

    }
}