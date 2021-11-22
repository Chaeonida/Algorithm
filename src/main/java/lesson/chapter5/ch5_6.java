package lesson.chapter5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ch5_6 {
    public int solution(int n, int m) {
        //offer. pull
        int answer = 0;
        Queue<Integer> Q=new LinkedList<>();
        for (int i = 0; i < n; i++) {
            Q.offer(i + 1);
        }

        while (!Q.isEmpty()){
            for (int j = 1; j < m; j++) {
                Q.offer(Q.poll());
            }
            if(Q.size()==1) answer=Q.poll();
            Q.poll();
        }

        return answer;
    }



    public static void main(String[] args) {
        ch5_6 T = new ch5_6();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(T.solution(n,m));
    }
}
