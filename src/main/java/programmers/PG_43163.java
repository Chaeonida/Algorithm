package programmers;

import java.util.Scanner;
public class PG_43163 {
    public static int answer = Integer.MAX_VALUE;

    public static void dfs(String begin, String target, String[] words, int L, int start) {
        if (begin == target) {
            answer = Math.min(answer,L);
        }
        if (L >= answer) return;
        if (L == words.length) return;


        for (int i = start; i < words.length; i++) {
            int cnt = 0;
            for (int j = 0; j < begin.length(); j++) {
                if (begin.charAt(j) != words[i].charAt(j)) {
                    cnt++;
                }
            }
            if (cnt <= 1) {
                dfs(words[i],target,words,L+1,start+1);
            }
        }

    }

    public int solution(String begin, String target, String[] words) {
        boolean check = false;
        for (String word : words) {
            if(word == target) check = true;
        }

        if(check) dfs(begin,target,words,0,0);
        else return 0;
        return answer;
    }

    public static void main(String[] args) {
        PG_43163 T = new PG_43163();
        Scanner kb = new Scanner(System.in);
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        System.out.println(T.solution(begin, target, words));
    }

}