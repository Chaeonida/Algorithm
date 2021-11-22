package lesson.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ch3_2 {

    public ArrayList<Integer> solution(int[] a, int[] b , int n, int m ) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(a[i] == b[j]){
                    answer.add(a[i]);
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        ch3_2 T = new ch3_2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }

        for(int x : T.solution(a,b,n,m)) System.out.print(x+" ");

    }
}
