package te;

import java.util.*;

public class coffee {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String coff = ""; 
		String coffimsi = ""; // ���ø��ϱ�����
		String americano = ""; 
		String Latte = ""; String latte = "";
		String espreso = "";
		String answ = "";
		String today = "";

		int money;
		int coin;
		int bill = 0;
		String[] today1 = new String[2];
		
		System.out.println("�ȳ��ϼ���. DY cafe �Դϴ� .");
		System.out.println("Ŀ�Ǹ� �����ðڽ��ϱ�? (y / n)");
		answ = input.next();
			
			
			if (answ.equals("y")) {
				System.out.println("Ŀ�Ǹ� ������ �ּ���!" + today + americano + Latte + latte + espreso);
				System.out.println("today, americano, latte, espreso");
				answ = input.next();
			}else if (answ.equals("n")) {
				System.out.println("�ȳ��� ���ʽÿ�!");
			}
			
			if (answ == americano) {
				System.out.println("�Ƹ޸�ī�븦 �����ϼ̽��ϴ�.");
				System.out.println("4500�� �Դϴ�.");
				bill += 4500; 
			}else if(answ == Latte) {
				System.out.println("ī��󶼸� �����ϼ̽��ϴ�.");
				System.out.println("5000�� �Դϴ�.");
				bill += 5000;
			}else if(answ == latte) {
				System.out.println("ī��󶼸� �����ϼ̽��ϴ�.");
				System.out.println("5000�� �Դϴ�.");
				bill += 5000;
			}else if(answ == espreso) {
				System.out.println("���������Ҹ� �����ϼ̽��ϴ�.");
				System.out.println("3500�� �Դϴ�.");
				bill += 3500;
			}else if(answ == today) {
				System.out.println("������ Ŀ�Ǹ� �����ϼ̽��ϴ�.");
				System.out.println("4300�� �Դϴ�.");
				bill += 4300;
				
			}
				
					
				}
				int a = 10;
				if (answ == today) {
					for (int i = a; a >= i ; --a) {
						System.out.println("������ Ŀ�� " + a + " ���� �ֽ��ϴ�");
						
//						today[2] = answ;
						coffimsi = today;
						System.out.println("������ Ŀ�Ǵ� " + today + " �Դϴ�.");
						}
					
					}
					}	
	
				}
}
	
