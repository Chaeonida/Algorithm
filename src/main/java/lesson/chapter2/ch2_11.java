package lesson.chapter2;

import java.util.Scanner;

public class ch2_11 {

    public int solution(int[][] Ban, int n) {
        int answer = 0;
        int[][] check = new int[n][5];
        int tmp = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n; j++) {
                tmp = Ban[j][i];
                if(j+1 >= n) continue;
                if (tmp == Ban[j + 1][i]) {
                    check[j][i] += 1;
                }
            }
        }

        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += check[i][j];
            }
            if(Max < sum) {
                Max = sum;
                answer = i+1;
            }

        }
        return answer;
    }


    public static void main(String[] args) {
        ch2_11 T = new ch2_11();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] score = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                score[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.solution(score,n));
    }
}
