package lesson.chapter2;

import java.util.ArrayList;
import java.util.Scanner;

public class ch2_1 {

    public ArrayList<Integer> solution(int[] num, int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int max = num[0];
        answer.add(num[0]);
        for (int i = 1; i < n; i++) {
            if(max < num[i]){
                answer.add(num[i]);
            }
            max = num[i];
        }

        return answer;
    }


    public static void main(String[] args) {
        ch2_1 T = new ch2_1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        ArrayList<Integer> answer = T.solution(num, n);
        for (int i = 0; i < answer.size(); i++) {
            System.out.print(answer.get(i)+" ");
        }
    }
}
