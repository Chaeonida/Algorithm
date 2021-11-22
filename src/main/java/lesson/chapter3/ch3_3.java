package lesson.chapter3;

import java.util.Scanner;

public class ch3_3 {
    public int solution(int[] a, int n, int m ) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += a[i];
        }
        answer=sum;
        for (int i = m ;i < n; i++) {
            sum += (a[i]-a[i-m]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }


    public static void main(String[] args) {
        ch3_3 T = new ch3_3();
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
