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
//	 	2������. �̸�,����,����,��� ...
//		3������. 1.��ȸ2.�Է�3. ������ ����
//		4������
//		System.out.println("�Է��ϼ��� : ");
//		String abc = input.next();
//		
//		for(int i = 0; i < abc.length(); i++) {
//			System.out.println(abc.substring(i,i+1));
//		}