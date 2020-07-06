package day07;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String yes = "y";
		int Value = 0;
		String Values = "";
		
		do {
			System.out.println("단을 입력하세요 :");
			int put = in.nextInt();
			
			for(int b = 1; b<= 9; b++) {
				Value = put*b;
				Values = put + "*" + b + "=" + Value;
				
				System.out.println(Values);
				
			
									}
			System.out.println("계속할려면 \"y\"를 누르세요");
			yes =  in.next();
			
		}while(yes.toLowerCase().equals("y"));
	System.out.println("프로그램을 종료합니다.");		
	}
//	next() 메소드의 경우 띄어쓰기 기준으로 읽기 때문에
//	A와 B사이의 띄어쓰기가 반영되어 출력결과가 다르게 나옴을 알 수 있다.
//	nextLine()메소드는 한 라인을 읽기 때문에 갍은 라인에 있는 A와 B를 그대로 출력한다.
//	nextint() 혹은 next()와 nextLine()을 섞어 사용했을 때 나타나는 오류를 알아야 한다.

}
