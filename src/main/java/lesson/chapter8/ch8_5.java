package lesson.chapter8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ch8_5 {
    static int n,m = 0;
    static int answer = Integer.MAX_VALUE;
    public void DFS(int L,int sum, Integer[] coin) {
        if(sum > m ) return;
        if(L >= answer) return;
        if (sum == m) {
            answer = Math.min(answer, L);
        }
        else{
            for (int i = 0; i < n; i++) {
                DFS(L+1,sum+coin[i],coin);
            }
        }
    }



    public static void main(String[] args) {
        ch8_5 T = new ch8_5();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Integer[] coin = new Integer[n];
        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }
        Arrays.sort(coin, Collections.reverseOrder());
        m = sc.nextInt();
        T.DFS(0,0,coin);
        System.out.println(answer);
    }
}
