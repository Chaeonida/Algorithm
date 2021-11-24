package baekjoon;


//    public void solution(int m) {
//
//    }
import java.io.*;
import java.util.*;


public class BJ_1929{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int[] arr = new int[end + 1];
        arr[0] = arr[1] = 1;
        for (int i = 2; i <= end; i++) {
            if (arr[i] == 0) {
                if(start <= i && i <= end) System.out.println(i);
                arr[i] = 1;
                for (int j = i; j <= end; j += i) {
                    arr[j] = 1;
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}



