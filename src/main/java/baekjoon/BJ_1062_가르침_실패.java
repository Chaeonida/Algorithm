package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_1062_가르침_실패 {
    static int n, k;
    //static boolean[] alpha;
    static String[] word;
    static ArrayList<Character> al;
    static HashMap<Character, Boolean> alpha;
    static int answer;

    public void DFS(int L, int s) {
        if (L == k) {
            int cnt = 0;
            for (String str : word) {
                boolean ch = false;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == 'a' || str.charAt(j) == 'n' || str.charAt(j) == 't'
                            || str.charAt(j) == 'i' || str.charAt(j) == 'c') continue;

                    if (!alpha.get(str.charAt(j))) {
                        ch = true;
                        break;
                    }
                }
                if (!ch) cnt++;
            }
            answer = Math.max(answer, cnt);
        } else {
            for (int i = s; i < alpha.size(); i++) {
                alpha.put(al.get(i), true);
                DFS(L + 1, i + 1);
                alpha.put(al.get(i), false);

            }
        }
    }

    public static void main(String[] args) throws IOException {
        BJ_1062_가르침_실패 T = new BJ_1062_가르침_실패();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        k -= 5;

        alpha = new HashMap<>();
        word = new String[n];
        al = new ArrayList<>();
        answer = 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            word[i] = s;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'a' || s.charAt(j) == 'n' || s.charAt(j) == 't'
                        || s.charAt(j) == 'i' || s.charAt(j) == 'c') continue;
                if (!alpha.containsKey(s.charAt(j))) {
                    alpha.put(s.charAt(j), false);
                    al.add(s.charAt(j));
                }
            }

        }

        if (k < 0) {
            answer = 0;
        } else{
            T.DFS(0, 0);
        }



        System.out.println(answer);
    }

}