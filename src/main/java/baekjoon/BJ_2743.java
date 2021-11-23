package baekjoon;


//    public void solution(int m) {
//        Stack<Integer> stack=new Stack<>();
//        int cnt =1 ;
//        while (stack.peek() <= m) {
//            stack.push(cnt);
//            System.out.println("+");
//            cnt++;
//        }
//        while (stack.peek() >= m) {
//            if (stack.empty()) {
//                System.out.println("No");
//            } else {
//                stack.pop();
//                System.out.println("-");
//            }
//        }
//    }
import java.io.*;
import java.util.*;

public class BJ_2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        System.out.println(s.length());
    }

}


