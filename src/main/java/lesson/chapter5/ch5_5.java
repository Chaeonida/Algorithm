package lesson.chapter5;

import java.util.Scanner;
import java.util.Stack;

public class ch5_5 {

    public int solution(String s) {
        int answer = 0;
        char tmp = ' ';
        Stack<Character> stack=new Stack<>();
        for (char x : s.toCharArray()) {
//            if(tmp == x){
//                answer+=1;
//            }
            if(x == '('){
                stack.push(x);
                tmp = x;
            }else{
                if (tmp == x) {
                    answer += 1;
                    stack.pop();
                }else{
                    stack.pop();
                    answer += stack.size();
                }
                tmp = x;
            }
        }

        return answer;
    }



    public static void main(String[] args) {
        ch5_5 T = new ch5_5();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(T.solution(s));
    }
}
