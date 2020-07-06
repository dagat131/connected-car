package day06;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
//		for (int i = 0; i < 99; i++) {
//			System.out.println(i);
//		}
		
//		for (int i = 10; i > 0;) {
//			System.out.println(i);
//			i = i -1;
//		}
//		for (int i = 0; i < 10;i = i + 1) {
//			if ( i == 4 ) {
//				continue;
//			}
//			System.out.println(i);
		
		/*
		for(초기값;최종값;증가값) {
		
		}
		*/
		
//		
//		int t = 0;
//		for (int a = 1; a <= 5; a++) {
//			t = t + a;
//			System.out.println(a + "번님, " + "안녕하세요");
////			System.out.println(a);      //for문 안에서 인식됨
//		}
//		System.out.println();
//		System.out.println(t);          //for문 바깥으로 나오면 인식하지못함
//		
//		//지역변수 , 전역변수

		//구구단 3단
		
//		int i = 1;
//		i = i * 1;
//		for (i = i; i < 10; i++) {
//			int k = 3 * i;
//			System.out.println("3 * " + i + " = " + k);
//			
		//구구단 7단
//		int i = 1;
//		i = i * 1;
//		for (i = i; i < 10; i++) {
//			int k = 7 * i;
//			System.out.println("7 * " + i + " = " + k);
		
		//구구단 9단
//		Scanner gugudan = new Scanner(System.in);
//		System.out.println("단수를 입력하세요 : ");
//		int a = gugudan.nextInt();
//		
//		for (int i = 1; i < 10; i = i + 1) {
//			int k = a * i;
//			if (i%3 == 0) { //3의 배수 구하기
//				System.out.println(a + " * " + i + " = " + k);
//			}
				
//			System.out.println(a + " * " + i + " = " + k);
			
		Scanner gugudan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int a = gugudan.nextInt();
		
		int a2=0;
		int a3=0;
		for (int a1 = 1; a1 <= a; a1 = a1 + 1) {
			

			if (a1 % 2 == 0) {
				a2+=a1;
//				System.out.println("짝수의 합 : " + a2);
			}
			else if (a1 % 2 != 0) {
				a3+=a1;
//				System.out.println("홀수의 합 : " + a3);

			}
		}
		System.out.println("짝수의 합 : " + a2);
		System.out.println("홀수의 합 : " + a3);
		int a4 = a2 + a3;
		System.out.println("총합계 : " +  a4);
	}
}
		

	


