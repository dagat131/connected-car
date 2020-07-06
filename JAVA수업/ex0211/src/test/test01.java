package test;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("in : ");
		String a = input.next();
		
		for (int i = 0; i<a.split("").length; i++) {
			System.out.println(a.split("")[i]);
		}
	}
}
//		
//	 	2번문제. 이름,성적,총점,평균 ...
//		3번문제. 1.조회2.입력3. 나가기 문제
//		4번문제
//		System.out.println("입력하세요 : ");
//		String abc = input.next();
//		
//		for(int i = 0; i < abc.length(); i++) {
//			System.out.println(abc.substring(i,i+1));
//		}