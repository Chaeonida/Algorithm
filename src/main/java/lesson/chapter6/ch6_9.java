package lesson.chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class ch6_9 {
    public int count(int[] arr, int capacity){
        int cnt=1, sum=0;
        for(int x : arr){
            if(sum+x>capacity){
                cnt++;
                sum=x;
            }
            else sum+=x;
        }
        return cnt;
    }

    public int solution(int n,int m, int[] song) {
        int answer = 0;
        int lt= Arrays.stream(song).max().getAsInt();
        int rt=Arrays.stream(song).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(song, mid) <= m ) {
                answer = mid;
                rt = mid-1;
            }
            else lt=mid+1;
        }
        return answer;
    }



    public static void main(String[] args) {
        ch6_9 T = new ch6_9();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] song = new int[n];
        for (int i = 0; i < n; i++) {
            song[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,m,song));
    }
}
