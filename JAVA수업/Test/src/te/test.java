package te;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		int inputs = 0;
		int random = 0;
		
		random = (int)(Math.random()*100) + 1 ;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("1과 100사이의 숫자를 입력하세요 : ");
			inputs = scanner.nextInt();
			
			if (inputs > random) {
				System.out.println("숫자를 더 작게 입력하세요.");
			}else if (inputs < random) {
				System.out.println("숫자를 더 크게 입력하세요.");
			}
			
			
		}while(inputs != random);
			System.out.println("프로그램을 종료합니다.");

	}
}


