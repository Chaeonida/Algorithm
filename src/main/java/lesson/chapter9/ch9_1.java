package lesson.chapter9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Body implements Comparable<Body> {
    public int h, w;

    Body(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Body o){
        return o.h - this.h;
    }
}

public class ch9_1 {
    public int solution(ArrayList<Body> arr, int n) {
        int answer = 0;
        Collections.sort(arr);
        int max_weinght = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr.get(i).w > max_weinght) {
                max_weinght = arr.get(i).w;
                answer ++;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        ch9_1 T = new ch9_1();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int h=kb.nextInt();
            int w=kb.nextInt();
            arr.add(new Body(h, w));
        }
        System.out.println(T.solution(arr, n));
    }
}
