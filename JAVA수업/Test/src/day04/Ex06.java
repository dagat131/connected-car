package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex06 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�̸�");
		String name = in.readLine();
		System.out.println("����");
		String money = in.readLine();
		
		int bonus = Integer.parseInt(money)*6;
		int year = (Integer.parseInt(money)*12) + bonus;
		
		System.out.println("���ʽ� : " + bonus);
		System.out.println("���� : " + year);
		
		String prnvalue = "�̸� : " + name + "\t���� : " + money + "\t���ʽ� : " + bonus + "\t���� : " + year;
		System.out.println(prnvalue);
	}

}
