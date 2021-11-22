package programmers;

import java.util.Scanner;

public class solution1 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int max_rank, min_ramk = 0;
        int[] rank = {6,6,5,4,3,2,1};
        int count = 0;
        int zero_number = 0;
        for (int x : lottos) {
            if (x == 0) {
                zero_number++;
            }
            for (int y : win_nums) {
                if (x == y) {
                    count ++;
                }

            }
        }
        max_rank = count + zero_number;
        min_ramk = count;
        int[] answer = {rank[max_rank],rank[min_ramk]};
        return answer;
    }


    public static void main(String[] args) {
        solution1 T = new solution1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] lottos = {44, 1, 0, 0, 31, 25};
        System.out.println(T.solution(lottos,win_nums));
    }
}
