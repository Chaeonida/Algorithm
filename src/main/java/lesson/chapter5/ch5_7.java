package lesson.chapter5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ch5_7 {

    public String solution(String n, String m) {
        //offer. pull
        String answer = "YES";
        Queue<Character> Q=new LinkedList<>();
        for (char x : n.toCharArray()) {
            Q.offer(x);
        }

        for (char x : m.toCharArray()) {
            if (Q.contains(x)) {
                if(x != Q.poll()) return "NO";
            }
        }
        if (!Q.isEmpty()) {
            return "NO";
        }
        return answer;
    }



    public static void main(String[] args) {
        ch5_7 T = new ch5_7();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String c = sc.next();
        System.out.println(T.solution(s,c));
    }
}
