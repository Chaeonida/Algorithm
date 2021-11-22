package lesson.chapter3;

import java.util.ArrayList;
import java.util.Scanner;

public class ch3_1 {
    public ArrayList<Integer> solution(int[] a, int[] b , int n, int m ) {
        ArrayList<Integer> answer = new ArrayList<>();
        int lt = 0,rt = 0;
        while (lt<n && rt<m) {
            if(a[lt]<a[rt]){
                answer.add(a[lt]);
                lt++;
            } else{
                answer.add(a[rt]);
                rt++;
            }
        }

        while (lt < n) {
            answer.add(a[lt]);
            lt++;
        }

        while (rt < m) {
            answer.add(b[rt]);
            rt++;
        }
        return answer;
    }


    public static void main(String[] args) {
        ch3_1 T = new ch3_1();
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
