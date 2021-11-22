package lesson.chapter2;

import java.util.Scanner;

public class ch2_7 {

    public int solution(int[] score, int n) {
        int answer = 0;
        int tmp = 0;
        for (int x : score) {
            if(x == 1) {
                tmp += 1;
                answer += tmp;
            }else{
                tmp = 0;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        ch2_7 T = new ch2_7();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }

        System.out.println(T.solution(score,n));
    }
}
