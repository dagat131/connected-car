package te;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		int inputs = 0;
		int random = 0;
		
		random = (int)(Math.random()*100) + 1 ;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("1�� 100������ ���ڸ� �Է��ϼ��� : ");
			inputs = scanner.nextInt();
			
			if (inputs > random) {
				System.out.println("���ڸ� �� �۰� �Է��ϼ���.");
			}else if (inputs < random) {
				System.out.println("���ڸ� �� ũ�� �Է��ϼ���.");
			}
			
			
		}while(inputs != random);
			System.out.println("���α׷��� �����մϴ�.");

	}
}


