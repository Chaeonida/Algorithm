package baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Queue<Integer> Q=new LinkedList<>();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            Q.offer(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (!Q.isEmpty()) {
            if (Q.size() == 1) {
                sb.append(Q.poll()+">");
                break;
            }

            for (int i = 0; i < k-1; i++) {
                Q.offer(Q.poll());
            }
            sb.append(Q.poll() + ", ");

        }

        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

}