package home1;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("���ڸ� �Է��ϼ��� : ");
//		
//		String a = scan.next();
//		int a1 = Integer.parseInt(a);
//		
//		int a2 = a1%2;
//		if (a2==0) {
//			System.out.println("¦���Դϴ�.");
//		}
//		if (a2==1) {
//			System.out.println("Ȧ���Դϴ�.");
//		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("�Է��ϼ���(a,b,c,d) : ");
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
//			System.out.println("�޶��!");
		}else if (a != c) {
//			System.out.println("�޶�!");
		}else {
//			System.out.println("����!");
		}
	}

}
