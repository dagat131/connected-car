package day06;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int a = in.nextInt();
		
		int i = 0;
		int sum = 0; 
		
		while (i < 10) {
			i ++ ;
			sum += a;
			System.out.println(i + ", 합계 : " + sum);
			
			
			
		}
		System.out.println("총 합계 : " + sum);
		
		
		/* for(초기값; 종료조건; 증가치){

	}
		*/
		}
}

