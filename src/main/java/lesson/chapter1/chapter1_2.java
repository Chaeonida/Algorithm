package lesson.chapter1;

import java.util.Scanner;

public class chapter1_2 {

    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            } else answer += Character.toLowerCase(x);
        }

        return answer;
    }
    public static void main(String[] args) {

        chapter1_2 T = new chapter1_2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));

    }

}

//class Main {
//    public String solution(String str){
//        String answer="";
//        for(char x : str.toCharArray()){
//            if(x>=97 && x<=122) answer+=(char)(x-32);
//            else answer+=(char)(x+32);
//        }
//        return answer;
//    }
//
//    public static void main(String[] args){
//        Main T = new Main();
//        Scanner kb = new Scanner(System.in);
//        String str=kb.next();
//        System.out.print(T.solution(str));
//    }
//}
