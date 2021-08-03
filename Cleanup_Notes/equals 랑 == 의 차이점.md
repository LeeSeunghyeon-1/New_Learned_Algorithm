### 📌 코드

public class Main {

public static void main(String[] args) {

String str1 = new String("abc");
String str2 = new String("abc");
String str3 = str1;
System.out.println(str3.equals(str2));
System.out.println(str1 == str2);
System.out.println(str1==str3);

}

}

### 📌 결과

true<br>
false<br>
true

### 📌 이유

"equals" => 내용 비교<br>

"==" => 주소 비교
