package lesson.chapter1;

import java.util.Scanner;

public class chapter1_11 {

    public String solution(String str) {
        String answer = "";
        char[] s = str.toCharArray();
        int count = 1;
        char c = s[0];
        for (int i = 1; i < s.length ; i++) {
            if(c == s[i]){
                count ++;
            }else{
                if (count == 1) {
                    answer += c;
                }else{
                    answer += c;
                    answer += count;
                }
                count = 1;
                c = s[i];
            }
        }

        if (count == 1) {
            answer += c;
        }else{
            answer += c;
            answer += count;
        }

        return answer;
    }


    public static void main(String[] args) {
        chapter1_11 T = new chapter1_11();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }

}
