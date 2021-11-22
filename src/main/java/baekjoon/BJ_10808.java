package baekjoon;

import java.io.*;
import java.util.*;

public class BJ_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int[] number = new int[26];


        for (char x : s.toCharArray()) { int i = x-97;
            number[i] ++;
        }

        for (int a : number) {
            System.out.print(a+" ");
        }
        // bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

}