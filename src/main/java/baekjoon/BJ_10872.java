package baekjoon;

import java.io.*;
import java.util.*;


public class BJ_10872{
    public int isFactorial(int n) {
        if(n <= 1) return  1;
        return isFactorial(n-1) * n;
    }


    public static void main(String[] args) throws IOException {
        BJ_10872 T = new BJ_10872();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n =  Integer.parseInt(br.readLine());
        System.out.println(T.isFactorial(n));

        bw.flush();
        bw.close();
        br.close();
    }

}