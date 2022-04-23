package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_81303_캠프준비 {
    static int n, low, high, diff;
    static int[] arr;
    static int answer;

    public int solution() {
        answer = 0;
        for (int i = 0; i < (1 << n); i++) {
            int s = 0;
            int lo = Integer.MAX_VALUE;
            int hi = -1;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) == 0) continue;
                s += arr[j];
                if (lo > arr[j]) lo = arr[j];
                if (hi < arr[j]) hi = arr[j];
            }

            if (s >= low && s <= high && hi - lo >= diff) answer++;
        }

        return answer;
    }


    public static void main(String[] args) throws IOException {
        BJ_81303_캠프준비 T = new BJ_81303_캠프준비();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        low = Integer.parseInt(st.nextToken());
        high = Integer.parseInt(st.nextToken());
        diff = Integer.parseInt(st.nextToken());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        System.out.println(T.solution());
    }

}
