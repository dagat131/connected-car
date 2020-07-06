package day04;

import java.util.*;

public class Ex02 {

// Scanner / 인풋 입력방법 1
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름을 입력하세요");
		String a = scanner.next();
		System.out.println(a);
		
		System.out.print("나이를 입력하세요");
		int b = scanner.nextInt();
		System.out.println(b);
		
		System.out.println(a + "님의 나이는 " + b + " 세 입니다.");
		System.out.println();
		
		
	}

}
