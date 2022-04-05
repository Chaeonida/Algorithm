package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_1062_가르침_성공 {
    static int n, k;
    //static boolean[] alpha;
    static String[] word;
    static boolean[] alpha;
    static int answer;

    public void DFS(int L, int s) {
        if (L == k) {
            int cnt = 0;
            for (String x : word) {
                boolean ch = false;
                for (int i = 0; i < x.length(); i++) {
                    if (!alpha[x.charAt(i) - 'a']) {
                        ch = true;
                        break;
                    }
                }
                if (!ch) {
                    cnt++;
                }
            }

            answer = Math.max(answer, cnt);
        } else {
            for (int i = s; i < 26; i++) {
                if (!alpha[i]) {
                    alpha[i] = true;
                    DFS(L + 1, i + 1);
                    alpha[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BJ_1062_가르침_성공 T = new BJ_1062_가르침_성공();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        k -= 5;
        alpha = new boolean[26];
        alpha[0] = true;
        alpha['n' - 'a'] = true;
        alpha['t' - 'a'] = true;
        alpha['i' - 'a'] = true;
        alpha['c' - 'a'] = true;

        word = new String[n];
        answer = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            word[i] = s;
        }


        if (k < 0) {
            answer = 0;
        } else {
            T.DFS(0, 0);
        }


        System.out.println(answer);
    }

}