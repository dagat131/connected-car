package day07;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int inputs = 0;
		
		do {
			System.out.println("�����ϼ���. (0:��ȸ, 1:�Է�, 2:����)");
			inputs = input.nextInt();
			
			if (inputs == 0) {
				System.out.println("��ȸ�������Դϴ�.");
			}else if (inputs == 1 ) {
				System.out.println("�Է��������Դϴ�.");
			}else if (inputs == 2) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
			}
			
			}while(inputs == 0 || inputs == 1);
//			System.out.println("");

	}

}
