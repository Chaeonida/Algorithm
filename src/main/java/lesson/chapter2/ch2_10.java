package lesson.chapter2;

import java.util.Scanner;

public class ch2_10 {
    public int solution(int[][] Map, int n) {
        int answer = 0;
        int[] dx={-1, 0, 1, 0};
        int[] dy={0, 1, 0, -1};
        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    x = i + dx[k];
                    y = j + dy[k];
                    if(x<0 || y<0 || x>= n || y >= n) continue;
                    if(Map[i][j]<=Map[x][y]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        ch2_10 T = new ch2_10();
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
