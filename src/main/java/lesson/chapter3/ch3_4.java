package lesson.chapter3;

import java.util.Scanner;

public class ch3_4 {

    public int solution(int[] a, int n, int m ) {
        int answer = 0;
        int lt = 0;
        int sum = 0;
        for (int rt = 0; rt < n; rt++){
            sum += a[rt];
            if(sum == m) answer ++;
            while(sum >= m) {
                sum -= a[lt];
                lt++;
                if(sum == m) answer++;
            }


        }

        return answer;
    }


    public static void main(String[] args) {
        ch3_4 T = new ch3_4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(T.solution(a,n,m));

    }
}
