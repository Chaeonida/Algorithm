package lesson.chapter2;

import java.util.Scanner;

public class ch2_3 {
    public String solution(int A, int B) {
        String answer = "";
        if(A == 1 && B == 2) answer += 'B';
        else if(A == 1 && B == 3) answer += 'A';
        else if(A == 2 && B == 3) answer += 'B';
        else if(A == 2 && B == 1) answer += 'A';
        else if(A == 3 && B == 1) answer += 'B';
        else if(A == 3 && B == 2) answer += 'A';
        else answer += 'D';

        return answer;
    }


    public static void main(String[] args) {
        ch2_3 T = new ch2_3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(T.solution(A[i],B[i]));
        }
    }
}
