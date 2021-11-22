package lesson.chapter8;

import java.util.Scanner;

public class ch8_3 {
    static int n,m = 0;
    static int answer = 0;
    public void DFS(int L,int sum,int totalTime, int[] score, int[] time) {
        if(totalTime > m) return;
        if( L == n){
            answer = Math.max(answer, sum);
        }
        else{
            DFS(L + 1, sum + score[L], totalTime + time[L], score, time);
            DFS(L + 1, sum , totalTime , score, time);

        }
    }



    public static void main(String[] args) {
        ch8_3 T = new ch8_3();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] score = new int[n];
        int[] time = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
            time[i] = sc.nextInt();
        }
        T.DFS(0,0,0,score,time);
        System.out.println(answer);
    }
}
