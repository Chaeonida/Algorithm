package lesson.chapter2;

import java.util.Scanner;

public class ch2_2 {
    public int solution(int[] num,int n) {
        int answer = 1;
        int max = num[0];
        for (int i = 1; i < n; i++) {
            if (max < num[i]) {
                answer += 1;
                max = num[i];
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        ch2_2 T = new ch2_2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println(T.solution(num,n));
    }
}
