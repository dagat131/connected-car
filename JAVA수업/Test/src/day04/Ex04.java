package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.println("�̸�, ����, �ֹι�ȣ�� �Է��ϼ���.");
//		
//		String name = in.readLine();
//		String sex = in. readLine();
//		String num = in. readLine();
//		
//		System.out.println("����� �̸��� " + name + " �Դϴ�.");
//		System.out.println("����� ������ " + sex + " �Դϴ�.");
//		System.out.println("����� �ֹι�ȣ�� " + num + " �Դϴ�.");
//		
		String s = "abcdefg";
		System.out.println(s);
		
		String t = s.substring(3,6);
		System.out.println(t);
	}

}
