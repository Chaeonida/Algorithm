![image](https://user-images.githubusercontent.com/46310555/148198346-7dc8bc18-7aa6-4eef-b4d2-c1e9cdd6723b.png)
## ๐์์ถ๋ ฅ
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

## ๐์ ๋ ฌ
#### ์ค๋ฆ์ฐจ์ ์ ๋ ฌ
int[] arr = new int[3];
Arrays.sort(arr);

#### ๋ด๋ฆผ์ฐจ์ ์ ๋ ฌ
Arrays.sort(arr, Collections.reverseOrder());

#### ์ ๋ ฌ๊ธฐ์ค ์ก๊ณ  ์ ๋ ฌ
Collections.sort(arr);

## ๐ ๋ฌธ์์ด
#### ๋์๋ฌธ์
(1) ๋์๋ฌธ์ ๋ณํ
- String ํ์ 
String str = "asd";
str = str.toUpperCase(); 
- char ํ์
char t = 'a';
t = Character.toUpperCase(t);
(2) ๋์๋ฌธ์ ํ์ธ
char x = 'a';
//์๋ฌธ์ ํ์ธ
Character.isLowerCase(x);
// ๋๋ฌธ์ 
Character.isUpperCase(x);
//์ซ์ ํ์ธ
Character.isDigit(c)

#### ๋ฌธ์ ์ญ์ ์ถ๋ ฅํ๊ธฐ (abc -> cba)
String tmp=new StringBuilder(x).reverse().toString();

#### ์ซ์์ธ์ง ํ์ธ
if(Character.isDigit(x));
if(x>=48 && x<=57)

#### ๋ฌธ์์ด ๋ฐ๊พธ๊ธฐ
```java
String a = "๋ฌด๊ถํ ์ผ์ฒ๋ฆฌ ํ๋ ค๊ฐ์ฐ ๋ํ์ฌ๋ ๋ํ์ผ๋ก ๊ธธ์ด ๋ณด์ ํ์ธ ";
a= a.replace("๋ํ", "๋ฏผ๊ตญ"); //replace([๊ธฐ์กด๋ฌธ์],[๋ฐ๊ฟ๋ฌธ์])
System.out.println(a); // ๋ฌด๊ถํ ์ผ์ฒ๋ฆฌ ํ๋ ค๊ฐ์ฐ ๋ฏผ๊ตญ์ฌ๋ ๋ฏผ๊ตญ์ผ๋ก ๊ธธ์ด ๋ณด์ ํ์ธ
```

```java
String a = "๋ฌด๊ถํ ์ผ์ฒ๋ฆฌ ํ๋ ค๊ฐ์ฐ ๋ํ์ฌ๋ ๋ํ์ผ๋ก ๊ธธ์ด ๋ณด์ ํ์ธ ";
a= a.replaceFirst("๋ํ", "๋ฏผ๊ตญ"); //replaceFirst([๊ธฐ์กด๋ฌธ์],[๋ฐ๊ฟ๋ฌธ์])
System.out.println(a); //๋ฌด๊ถํ ์ผ์ฒ๋ฆฌ ํ๋ ค๊ฐ์ฐ ๋ฏผ๊ตญ์ฌ๋ ๋ํ์ผ๋ก ๊ธธ์ด ๋ณด์ ํ์ธ
```

#### ๋ฌธ์์ด ์๋ฅด๊ธฐ
- index 0~7
String tmp=s.substring(0, 7);
- index 7~
s=s.substring(7);

#### ๋ฌธ์์ด -> ๊ณต๋ฐฑ ๊ธฐ์ค์ผ๋ก ๋ฐฐ์ด์ ์ ์ฅ
str = "asdf dfg fds";
String[] s = str.split(" ");


#### index 
String s = "abcabc"
str.indexOf(a) // a๊ฐ ๋์ค๋ ์ฒซ๋ฒ์งธ index ๋ฐํ 
// 1 ์ถ๋ ฅ 


## ๐ ๋ฐ๋ณต๋ฌธ
for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==t) answer++;
      }
      
for(char x : str.toCharArray())

## ๐ ๋ฐฐ์ด
#### ๋์  ๋ฐฐ์ด
- ๋ฐฐ์ด ์ด๊ธฐํ
ArrayList<Integer> answer = new ArrayList<>();
- ๋ฐฐ์ด์ ์์ ์ถ๊ฐ 
answer.add(a[lt]);
- i ๋ฒ์งธ ๊ฐ ๊ฐ์ ธ์ค๊ธฐ
answer.get(i)	



## ๐ Hash Map
HashMap<Character, Integer> map=new HashMap<>();
#### ๊ฐ ๋ฃ๊ธฐ
- map.put('x',1);

- s๋ผ๋ key๊ฐ ์์ผ๋ฉด 0์ผ๋ก ๋ฃ์ด์ค
  map.put('s',map.getOrDefault('s',0));
  
#### Map์ key๊ฐ ์กด์ฌํ๋์ง ํ์ธ
map.containsKey('F');

#### key์ ๊ฐฏ์ 
map.size();

#### ํน์  ํค ์ญ์ 
map.remove('A'); //A๋ผ๋ ํค ์ ๊ฑฐ , A์ ๊ฐ ๋ฆฌํด
	
#### map ์ถ๋ ฅ
- map.keySet()  : key์ ๊ฐ ๊ฐ์ง๊ณ  ์๋ ๋ฐฐ์ด 
```java
for (String key : map.keySet()) {
	String value = map.get(key);
    System.out.println("[key]:" + key + ", [value]:" + value);
}  	
```
- map.entrySet() : key์ value ๋ชจ๋ ๊ฐ์ง๊ณ  ์๋ ๋ฐฐ์ด
```java

for (Map.Entry<String, String> entry : map.entrySet()) {
	System.out.println("[key]:" + entry.getKey() + ", [value]:" + entry.getValue());
}	
```
## ๐ Stack 
Stack<Character> stack=new Stack<>();

## ๐ ํ 
### ๐ง ์ฐ์ ์์ ํ
PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>(); //๋ฎ์ ์ซ์ ๋ถํฐ ๋์ด
PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>(Collections.reverseOrder()); // ๋์ ์ซ์ ๋ถํฐ ๋์ด

#### ํ ์ ์ธ
Queue<Integer> Q=new LinkedList<>();
#### Queue ๊ฐ ์ถ๊ฐ
queue.add(2);     // queue์ ๊ฐ 2 ์ถ๊ฐ
queue.offer(3);   // queue์ ๊ฐ 3 ์ถ๊ฐ
#### Queue ๊ฐ ์ญ์ 
queue.poll();       // queue์ ์ฒซ๋ฒ์งธ ๊ฐ์ ๋ฐํํ๊ณ  ์ ๊ฑฐ ๋น์ด์๋ค๋ฉด null
queue.remove();     // queue์ ์ฒซ๋ฒ์งธ ๊ฐ ์ ๊ฑฐ
queue.clear();      // queue ์ด๊ธฐํ
#### Queue ์์ ๊ฐ์ฅ ๋จผ์  ๋ค์ด๊ฐ ๊ฐ ์ฐธ์กฐ(์ค์ ๋ก ํ์์ ๋์ค๋๊ฑด ์๋)
queue.peek();       // queue์ ์ฒซ๋ฒ์งธ ๊ฐ ์ฐธ์กฐ
	


## ๐ ์์คํค ์ฝ๋
#### ์ํ๋ฒณ ๋ฐฐ์ด์ ๋์์ํค๊ธฐ 
```java
	static int[] alpha = {3, 2, 1,	2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1};
	String str = br.readLine();
        for(int i = 0; i < str.length(); i++) {
            Q.add(alpha[str.charAt(i) - 'A']);
        }
```
