package lesson.chapter1;

import java.util.Scanner;

public class chapter1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.next();

        int answer = 0;
        char c = in.next().charAt(0);

        input1 = input1.toUpperCase();
        c = Character.toUpperCase(c);

        for (char x : input1.toCharArray()) {
            if (x == c) answer++;
        }

        System.out.println(answer);
    }
}
