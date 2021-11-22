package lesson.chapter7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ch7_8 {
    public int solution(int n, int m) {
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        int[] ch = new int[100001];
        int[] dx = {1, -1, 5};
        Q.offer(n);
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                for (int j = 0; j < 3; j++) {
                    int nx = x + dx[j];
                    if (nx == m) {
                        return answer+1;
                    }
                    if(nx > 1 && nx < 10000&& ch[nx] == 0){
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
        }


        return answer;
    }



    public static void main(String[] args) {
        ch7_8 T = new ch7_8();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(T.solution(n,m));
    }
}
