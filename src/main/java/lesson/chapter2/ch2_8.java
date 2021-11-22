package lesson.chapter2;

import java.util.Scanner;

public class ch2_8 {
    public int solution(int[][] score, int n) {
        int answer = -2147000000;
        int tmp1 = 0;
        int tmp2 = 0;
        for (int i = 0; i < n; i++) {
            tmp1 =tmp2 = 0;
            for (int j = 0; j < n; j++){
                tmp1 += score[i][j];
                tmp2 += score[j][i];
            }
            answer = Math.max(answer, tmp2);
            answer = Math.max(answer, tmp1);
        }

        tmp1 = 0;
        tmp2 = 0;
        for (int i =0 ; i < n; i++) {
            tmp1 += score[i][i];
            tmp2 += score[i][n - i -1];
        }
        answer = Math.max(answer, tmp2);
        answer = Math.max(answer, tmp1);
        return answer;
    }


    public static void main(String[] args) {
        ch2_8 T = new ch2_8();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] score = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                score[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.solution(score,n));
    }
}
