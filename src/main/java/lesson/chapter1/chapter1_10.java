package lesson.chapter1;

import java.util.Scanner;

import static java.lang.Math.min;

public class chapter1_10 {
    public int[] solution(String str,char c) {
        int[] answer=new int[str.length()];
        char[] s = str.toCharArray();
        int p = 1001;
        for (int i = 0; i < str.length(); i++) {
            if(s[i] == c){
                p=0;
                answer[i] = p;
            }
            else {
                p ++;
                answer[i] = p;
            }
        }

        p = 1001;
        for (int i = str.length()-1; i >=0; i--) {
            if(s[i] == c){
                p=0;
            }
            else{
                p ++;
                answer[i] = min(answer[i],p);
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        chapter1_10 T = new chapter1_10();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c=sc.next().charAt(0);
        for(int x : T.solution(str, c)){
            System.out.print(x+" ");
        }


    }
}
