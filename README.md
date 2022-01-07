![image](https://user-images.githubusercontent.com/46310555/148198346-7dc8bc18-7aa6-4eef-b4d2-c1e9cdd6723b.png)
## 📌입출력
#### StringTokenizer
```java
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arrays = new int[n];
        for (int i = 0; i < n; i++) {
            arrays[i] = Integer.parseInt(st.nextToken());
        }
```

#### BufferedReader, BufferedWriter
```java
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
```

#### StringBuilder
```java
 StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(arrays[i]).append(' ');
        }
	
	System.out.println(sb);
        // bw.write(sb.toString() + "\n");
```

## 📌정렬
#### 오름차순 정렬
int[] arr = new int[3];
Arrays.sort(arr);

#### 내림차순 정렬
Arrays.sort(arr, Collections.reverseOrder());

#### 정렬기준 잡고 정렬
Collections.sort(arr);

## 📌 문자열
#### 대소문자
(1) 대소문자 변환
- String 타입 
String str = "asd";
str = str.toUpperCase(); 
- char 타입
char t = 'a';
t = Character.toUpperCase(t);
(2) 대소문자 확인
char x = 'a';
Character.isLowerCase(x);

#### 문자 역순 출력하기 (abc -> cba)
String tmp=new StringBuilder(x).reverse().toString();

#### 숫자인지 확인
if(Character.isDigit(x));
if(x>=48 && x<=57)

#### 문자열 바꾸기
```java
String a = "무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세 ";
a= a.replace("대한", "민국"); //replace([기존문자],[바꿀문자])
System.out.println(a); // 무궁화 삼천리 화려강산 민국사람 민국으로 길이 보전하세
```

```java
String a = "무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세 ";
a= a.replaceFirst("대한", "민국"); //replaceFirst([기존문자],[바꿀문자])
System.out.println(a); //무궁화 삼천리 화려강산 민국사람 대한으로 길이 보전하세
```

#### 문자열 자르기
- index 0~7
String tmp=s.substring(0, 7);
- index 7~
s=s.substring(7);

#### 문자열 -> 공백 기준으로 배열에 저장
str = "asdf dfg fds";
String[] s = str.split(" ");


#### index 
String s = "abcabc"
str.indexOf(a) // a가 나오는 첫번째 index 반환 
// 1 출력 


## 📌 반복문
for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==t) answer++;
      }
      
for(char x : str.toCharArray())

## 📌 배열
#### 동적 배열
- 배열 초기화
ArrayList<Integer> answer = new ArrayList<>();
- 배열에 원소 추가 
answer.add(a[lt]);
- i 번째 값 가져오기
answer.get(i)	



## 📌 Hash Map
HashMap<Character, Integer> map=new HashMap<>();
#### 값 넣기
- map.put('x',1);

- s라는 key값 없으면 0으로 넣어줌
  map.put('s',map.getOrDefault('s',0));
  
#### Map에 key가 존재하는지 확인
map.containsKey('F');

#### key의 갯수 
map.size();

#### 특정 키 삭제
map.remove('A'); //A라는 키 제거 , A의 값 리턴

## 📌 Stack 
Stack<Character> stack=new Stack<>();

## 📌 큐 
Queue<Point> Q=new LinkedList<>();


