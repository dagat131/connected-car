package day07;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String yes = "y";
		int Value = 0;
		String Values = "";
		
		do {
			System.out.println("���� �Է��ϼ��� :");
			int put = in.nextInt();
			
			for(int b = 1; b<= 9; b++) {
				Value = put*b;
				Values = put + "*" + b + "=" + Value;
				
				System.out.println(Values);
				
			
									}
			System.out.println("����ҷ��� \"y\"�� ��������");
			yes =  in.next();
			
		}while(yes.toLowerCase().equals("y"));
	System.out.println("���α׷��� �����մϴ�.");		
	}
//	next() �޼ҵ��� ��� ���� �������� �б� ������
//	A�� B������ ���Ⱑ �ݿ��Ǿ� ��°���� �ٸ��� ������ �� �� �ִ�.
//	nextLine()�޼ҵ�� �� ������ �б� ������ �G�� ���ο� �ִ� A�� B�� �״�� ����Ѵ�.
//	nextint() Ȥ�� next()�� nextLine()�� ���� ������� �� ��Ÿ���� ������ �˾ƾ� �Ѵ�.

}
