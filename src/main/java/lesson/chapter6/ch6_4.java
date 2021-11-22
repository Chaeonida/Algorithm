package lesson.chapter6;

import java.util.Scanner;

public class ch6_4 {
        public int[] solution(int n,int m, int[] work) {
            int[] answer = new int[n];
            for (int x : work) {
                int pos = -1;
                for (int i = 0; i < n; i++) {
                    if(x == answer[i]) pos = i;
                }
                if (pos == -1) {
                    for (int i = n - 1; i >= 1; i--) {
                        answer[i] = answer[i-1];
                    }
                }else{
                    for (int i = pos; i >= 1; i--) {
                        answer[i] = answer[i - 1];
                    }
                }
                answer[0] = x;
            }
            return answer;
        }



        public static void main(String[] args) {
            ch6_4 T = new ch6_4();
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] work = new int[m];
            for (int i = 0; i < m; i++) {
                work[i] = sc.nextInt();
            }
            for(int x : T.solution(n, m, work)) System.out.print(x+" ");
        }
}
