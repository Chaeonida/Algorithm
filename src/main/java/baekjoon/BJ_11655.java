package baekjoon;

import java.io.*;

public class BJ_11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        for (char x : s.toCharArray()) {
            if (x >= 'a' && x <= 'z') {
                if (x > 'm') {
                    int num = x-13;
                    sb.append((char) num);
                } else {
                    int num = x + 13;
                    sb.append((char) num);
                }
            } else if (x >= 'A' && x <= 'Z') {
                if (x > 'M') {
                    int num = x - 13;
                    sb.append((char) num);

                } else {
                    int num = x + 13;
                    sb.append((char) num);
                }
            } else {
                sb.append(x);
            }
        }
        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

}


