package day04;

public class Ex01 {

	public static void main(String[] args) {
		/* 비트연산자
		 * 10진수 -> 2진수로 변환
		 * 
		 * 	  8 4 2 1 
		 * 5: 0 1 0 1
		 * 7: 0 1 1 1
		 * 
		 * =============
		 * 
		 * and : 0101
		 *  or : 0111
		 *   ^ : 0010
		 *   
		 * 5 and 7
		 * 5 or 7
		 * 5 ^ 7 (XOR) : 같은값이 들어오면 0, 다른값이 들어오면 1
		 * 
		 * * 왼쪽 shift
		 * 5 << 2 : 5 * (2**2) : 20
		 * 5 << 1 : 5 * (2**1) : 10
		 * 
		 * * 오른쪽 shift
		 * 나눗셈
		 */
		
		//삼항연산자
		String s = (5 < 7) ? "T" : "F";
		System.out.println(s);

//		String ss = (5 < 7) ? "T" : 0;
//		System.out.println(ss);
	
		int sss = (5 < 7) ? 1 : 0;
		System.out.println(sss);

		/* 부호연산자
		 * int a = +5;  앞의 플러스가 부호연산자(플러스는 보통 자동생략이 된다)
		 * int a = -5;  앞의 마이너스가 부호연산자(마이너스는 넣어줘야한다.)
		 */
		
		String name = "김대용";
		System.out.println(name);
		
		System.out.println("당신의 이름은 " + name + " 입니다");
		
		int agee = 28;
		System.out.println(name + " 님의 나이는 " + agee + " 세 입니다.");
		
		int year = 1993;
		int age = 2020 - year;
		System.out.println("나이 : " + age);
		
		year = 2000;
		age = 2020 - year;
		System.out.println("나이 : " + age);
		
		
	
	}

}
