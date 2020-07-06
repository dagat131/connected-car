package home1;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요 : ");
//		
//		String a = scan.next();
//		int a1 = Integer.parseInt(a);
//		
//		int a2 = a1%2;
//		if (a2==0) {
//			System.out.println("짝수입니다.");
//		}
//		if (a2==1) {
//			System.out.println("홀수입니다.");
//		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("입력하세요(a,b,c,d) : ");
		String input1 = input.next();
		String a = "hello";
		String b = "Hello";
		String c = "hEllo";
		String d = "hello";
		
//		System.out.println(a.contentEquals(b));
//		System.out.println(a.contentEquals(c));
//		System.out.println(a.contentEquals(d));
//		
		
		
		if (a!=b) {
//			System.out.println("달라요!");
		}else if (a != c) {
//			System.out.println("달라!");
		}else {
//			System.out.println("같아!");
		}
	}

}
