package 문제;
/*
[문제10] 다음과 같은 메서드를 작성하고 결과를 완성하시오
(1)메인메서드에서 아래 메서드를 호출하고 호출메서드에서 
    계산된 결과를  리턴할것 
     sum(3,5)    /     sub(7,2)   /     mul(4,5)   /     div(7,3)
(2)메서드에서 받은 결과값은 메인메서드에서 출력하시오

[실행 예]
System.out.println("더하기 : " + sum(3,5));             

[출력화면]
더하기 : 8
빼  기 : 5
곱하기 : 20
나누기 : 2.33
*/
public class 문제10 {
public static int sum(int a, int b) {
	
	int result = a+b;
	return result;
}

public static int sub(int a, int b) {
	
	int result = a-b;
	return result;
}

public static int mul(int a, int b) {
	
	int result = a*b;
	return result;
}

public static double div(int a, int b) {
	
	return (double) a/b;
}

public static void main(String[] args) {
		System.out.println("더하기 : " + sum(3,5));   
		System.out.println("빼   기 : " + sub(7,2));             
		System.out.println("곱하기 : " + mul(4,5));             
		System.out.printf("나누기 : %.2f", (div(7,2)));             
	}
}
