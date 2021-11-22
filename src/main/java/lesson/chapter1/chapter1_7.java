package lesson.chapter1;

import java.util.Scanner;

public class chapter1_7 {
    public String solution(String str) {
        String answer = "";
        str = str.toUpperCase();
        char[] s=str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;
        while (lt<rt){
            if (s[lt] != s[rt]) {
                answer = "NO";
                break;
            }
            lt ++;
            rt --;
            answer = "YES";
        }

        return answer;
    }


    public static void main(String[] args) {
        chapter1_7 T = new chapter1_7();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));


    }
}
