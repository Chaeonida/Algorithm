package lesson.chapter3;

import java.util.Scanner;

public class ch3_5 {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int lt = 1;
        for (int i = 1 ; i < n; i++) {
            sum += i;
            if(sum == n) answer++;
            while(sum>= n){
                sum -= lt;
                lt ++;
                if(sum == n) answer++;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        ch3_5 T = new ch3_5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(T.solution(n));

    }
}
