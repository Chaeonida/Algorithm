package lesson.chapter9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class time implements Comparable<time>{
    public time(int startTime, int endTime) {
        this.s = startTime;
        this.e = endTime;
    }

    int s;
    int e;

    @Override
    public int compareTo(time o) {
        if(this.e==o.e) return this.s-o.s;
        else return this.e-o.e;
    }
}

public class ch9_2 {
    public int solution(ArrayList<time> arr, int n) {
        int answer = 0;
        Collections.sort(arr);
        int endTime = 0;
        for (int j = 0 ; j < n; j++) {
            if(endTime <= arr.get(j).s){
                endTime = arr.get(j).e;
                answer ++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ch9_2 T = new ch9_2();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        ArrayList<time> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int h=kb.nextInt();
            int w=kb.nextInt();
            arr.add(new time(h, w));
        }
        System.out.println(T.solution(arr, n));
    }
}
