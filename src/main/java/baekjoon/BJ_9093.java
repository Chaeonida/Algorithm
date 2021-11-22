package baekjoon;



import java.util.Scanner;

public class BJ_9093 {
//    public String solution(String s) {
//        String answer = "";
//        String[] str = s.split(" ");
//        for (String x : str) {
//            String tmp=new StringBuilder(x).reverse().toString();
//            answer += tmp;
//        }
//        return answer;
//    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String s = kb.nextLine();
            String[] str = s.split(" ");
            StringBuilder result = new StringBuilder();
            for (String x : str) {
                String tmp=new StringBuilder(x).reverse().toString();
                result.append(tmp);
                result.append(" ");
            }
            answer[i] = result.toString();
        }

        for (String x : answer) {
            System.out.println(x);
        }
    }
}