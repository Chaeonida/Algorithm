package lesson.chapter8;

import java.util.Scanner;

public class ch8_4 {
    static int n,m = 0;
    static int[] pm;
    public void DFS(int L) {
        if(L == m) {
            for (int x : pm) {
                System.out.print(x+ " ");
                System.out.println();
            }
        }
        else{
            for (int i = 0; i < n; i++) {
                pm[L] = i;
                DFS(L+1);
            }

        }
    }



    public static void main(String[] args) {
        ch8_4 T = new ch8_4();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] pm = new int[m];

        T.DFS(0);
    }
}
