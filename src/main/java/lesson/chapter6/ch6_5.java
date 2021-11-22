package lesson.chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class ch6_5 {
    public String solution(int n,int[] work) {
        //offer. pull
        String answer = "U";
        Arrays.sort(work);
        for (int i = 0; i < n-1 ; i++) {
            if(work[i] == work[i+1]) return "D";
        }
        return answer;
    }



    public static void main(String[] args) {
        ch6_5 T = new ch6_5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] work = new int[n];
        for (int i = 0; i < n; i++) {
            work[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,work));
    }
}
