package lesson.chapter1;

import java.util.Scanner;

public class chapter1_9 {
    public String solution(String str) {
        String answer = "";
        char[] c = str.toCharArray();
        for (char x : c) {
            if(Character.isDigit(x)){
                if(answer.length()==0 && x == '0') continue;
                answer += x;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        chapter1_9 T = new chapter1_9();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));


    }
}
