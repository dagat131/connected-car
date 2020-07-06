package test02;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		
		int num = input.nextInt();
		int sum = 0;
		
		while(num!=0) {
			sum += num%10;
			num /= 10;
		}
		System.out.println("각숫자의 합은 " + sum + "입니다.");
		
	}

}
