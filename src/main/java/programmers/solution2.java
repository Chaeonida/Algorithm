package programmers;

import java.util.Scanner;

//숫자 문자열과 영단어
public class solution2 {

    public int solution(String s) {

        String[]  num= {"0","1","2","3","4","5","6","7","8","9"};
        String[] word= {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};
        for (int i = 0 ; i <10 ; i++){
            s = s.replace(word[i] , num[i]);
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        solution2 T = new solution2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "one4seveneight";
        System.out.println(T.solution(s));
    }
}
