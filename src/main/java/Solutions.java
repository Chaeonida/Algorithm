import lesson.chapter8.Point;

import java.util.*;

public class Solutions {
    public static void main(String[] args) {
        //배열 관련
            // 정렬
        int[] arr = new int[3];
        Arrays.sort(arr);
        Arrays.sort(arr, Collections.reverseOrder()); //내림차순 정렬
        Collections.sort(arr); // 정렬기준 잡고 정렬
            // 배열 복사
        int[] arr1 =arr.clone();

        // 대문자로 변환
        String str = "asd";
        str = str.toUpperCase();

        // 대소문자 변환 : char 타입
        char t = 'a';
        t = Character.toUpperCase(t);

        //대소문자 확인
        char x = 'a';
        Character.isLowerCase(x);

        //반복문
        /*for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==t) answer++;
		}*/
//        for(char x : str.toCharArray()){
//            if(x==t) answer++;

        //공백 기준으로 배열에 저장
        str = "asdf dfg fds";
        String[] s = str.split(" ");

        //문자 역순 출력하기 abc -> cba
        String tmp=new StringBuilder(x).reverse().toString();

        //숫자인지 확인
        if(Character.isDigit(x));

        // Hash Map
        HashMap<Character, Integer> map=new HashMap<>();

        map.put('x',1);
        // s라는 key값 없으면 0으로 넣어줌
        map.put('s',map.getOrDefault('s',0));
        //Map에 key가 존재하는지
        map.containsKey('F');
        //key의 갯수
        map.size();
        //특정 키 삭제
        map.remove('A'); //A라는 키 제거 , A의 값 리턴
    }

    //Stack
    Stack<Character> stack=new Stack<>();

    //큐
    Queue<Point> Q=new LinkedList<>();
    //


    String a = "무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세 ";
//replace([기존문자],[바꿀문자])
    a= a.replace("대한", "민국");
System.out.println(a);

//결과값 : 무궁화 삼천리 화려강산 민국사람 민국으로 길이 보전하세


    String a = "무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세 ";
//replaceFirst([기존문자],[바꿀문자])
    a= a.replaceFirst("대한", "민국");
System.out.println(a);

//결과값 : 무궁화 삼천리 화려강산 민국사람 대한으로 길이 보전하세
}



