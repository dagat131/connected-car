package test02;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ��� : ");
		
		int num = input.nextInt();
		int sum = 0;
		
		while(num!=0) {
			sum += num%10;
			num /= 10;
		}
		System.out.println("�������� ���� " + sum + "�Դϴ�.");
		
	}

}
