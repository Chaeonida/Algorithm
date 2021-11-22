package lesson.chapter8;

import java.util.Scanner;

public class ch8_2 {
    static int n,m = 0;
    static int answer = 0;
    public void DFS(int L,int sum,int[] arr) {
        if(sum > m) return;
        if (L == m) {
            answer = Math.max(answer, sum);

        }
        else{
            DFS(L+1,sum+arr[L],arr);
            DFS(L+1,sum,arr);

        }
    }



    public static void main(String[] args) {
        ch8_2 T = new ch8_2();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        T.DFS(0,0,arr);
        System.out.println(answer);
    }
}
