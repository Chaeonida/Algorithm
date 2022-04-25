package programmers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PG_72416_매출하락최소화 {
    static int n;
    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;
    static int[][] dp;

    public int solution(int[] sales, int[][] links) {
        int answer = 0;

        n = sales.length;
        dp = new int[n + 1][2];
        visited = new boolean[n + 1];

        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<= n; i++){
            graph.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < links.length; i++) {
            int a = links[i][0];
            int b = links[i][1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        dfs(1, sales);
        answer = Math.min(dp[1][0], dp[1][1]);
        for (int i = 1; i < dp.length; i++) {
            System.out.println(dp[i][0] + " " + dp[i][1]);
        }
        System.out.println(answer);
        return answer;
    }

    static public void dfs(int number, int[] sales) {
        //0: 워크샵 참석 X
        //1: 워크샵 참석

        visited[number] = true;
        dp[number][0] = 0;
        dp[number][1] = sales[number-1];

        if(graph.get(number).size() == 1) return;

        int extra = Integer.MAX_VALUE;
        for (int child : graph.get(number)) {
            if (!visited[child]) {
                dfs(child, sales);
                if(dp[child][0] < dp[child][1]) {
                    dp[number][0] += dp[child][0];
                    dp[number][1] += dp[child][0];
                    extra = Math.min(extra, dp[child][1] - dp[child][0]);
                } else {
                    dp[number][0] += dp[child][1];
                    dp[number][1] += dp[child][1];
                    extra = 0;
                }
            }
        }
        dp[number][0] += extra;
    }


    public static void main(String[] args) throws IOException {
        PG_72416_매출하락최소화 T = new PG_72416_매출하락최소화();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] sales = {14, 17, 15, 18, 19, 14, 13, 16, 28, 17};
        int[][] links = {{10, 8}, {1, 9}, {9, 7}, {5, 4}, {1, 5}, {5, 10}, {10, 6}, {1, 3}, {10, 2}};

        T.solution(sales, links);


    }
}
