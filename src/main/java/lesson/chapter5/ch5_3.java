package lesson.chapter5;

import java.util.Scanner;
import java.util.Stack;

public class ch5_3 {
    public int solution(int[][] board, int[] moves, int n, int m) {
        int answer = 0;
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < m; i++) {
            int k = moves[i]-1;
            for (int j = 0; j < n; j++) {
                if(board[j][k] != 0 ) {
                    if(!stack.isEmpty() && board[j][k]==stack.peek()){
                        answer+=2;
                        stack.pop();
                    }
                    else{
                        stack.push(board[j][k]);
                    }
                    board[j][k] = 0;
                    break;
                }
            }
        }


        return answer;
    }



    public static void main(String[] args) {
        ch5_3 T = new ch5_3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }

        System.out.println(T.solution(board,moves,n,m));
    }
}
