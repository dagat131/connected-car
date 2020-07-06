package te;

import java.util.*;

public class coffee {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String coff = ""; 
		String coffimsi = ""; // 스플릿하기위함
		String americano = ""; 
		String Latte = ""; String latte = "";
		String espreso = "";
		String answ = "";
		String today = "";

		int money;
		int coin;
		int bill = 0;
		String[] today1 = new String[2];
		
		System.out.println("안녕하세요. DY cafe 입니다 .");
		System.out.println("커피를 뽑으시겠습니까? (y / n)");
		answ = input.next();
			
			
			if (answ.equals("y")) {
				System.out.println("커피를 선택해 주세요!" + today + americano + Latte + latte + espreso);
				System.out.println("today, americano, latte, espreso");
				answ = input.next();
			}else if (answ.equals("n")) {
				System.out.println("안녕하 가십시오!");
			}
			
			if (answ == americano) {
				System.out.println("아메리카노를 선택하셨습니다.");
				System.out.println("4500원 입니다.");
				bill += 4500; 
			}else if(answ == Latte) {
				System.out.println("카페라떼를 선택하셨습니다.");
				System.out.println("5000원 입니다.");
				bill += 5000;
			}else if(answ == latte) {
				System.out.println("카페라떼를 선택하셨습니다.");
				System.out.println("5000원 입니다.");
				bill += 5000;
			}else if(answ == espreso) {
				System.out.println("에스프레소를 선택하셨습니다.");
				System.out.println("3500원 입니다.");
				bill += 3500;
			}else if(answ == today) {
				System.out.println("오늘의 커피를 선택하셨습니다.");
				System.out.println("4300원 입니다.");
				bill += 4300;
				
			}
				
					
				}
				int a = 10;
				if (answ == today) {
					for (int i = a; a >= i ; --a) {
						System.out.println("오늘의 커피 " + a + " 잔이 있습니다");
						
//						today[2] = answ;
						coffimsi = today;
						System.out.println("오늘의 커피는 " + today + " 입니다.");
						}
					
					}
					}	
	
				}
}
	
