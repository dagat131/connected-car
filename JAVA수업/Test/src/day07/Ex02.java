package day07;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int inputs = 0;
		
		do {
			System.out.println("선택하세요. (0:조회, 1:입력, 2:종료)");
			inputs = input.nextInt();
			
			if (inputs == 0) {
				System.out.println("조회페이지입니다.");
			}else if (inputs == 1 ) {
				System.out.println("입력페이지입니다.");
			}else if (inputs == 2) {
				System.out.println("프로그램이 종료되었습니다.");
			}
			
			}while(inputs == 0 || inputs == 1);
//			System.out.println("");

	}

}
