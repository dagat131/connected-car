package day06;

import java.util.Scanner;

public class Ex07 {  /////////�ٽ��ϱ� ������  �� ���� ����Ʈ, 

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String name1 = "",name2 = "",name3 = "",name4 = "", name5 = "";
		int price1 = 0,price2=0,price3=0,price4=0,price5=0;
		int point1 = 0,point2=0,point3=0,point4=0,point5=0;
		int sum = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("��ǰ�� : ");
			String name =in.next();
			System.out.println("��ǰ���� : ");
			int price = in.nextInt();
			int point = 0;
			
			//����Ʈ����
			if (price >= 50000) {
				point = 10000;
			}else if (price >= 30000) {
				point = 2990;
			}else if (price >= 20000) {
				point = 1000;
			}else if (price >= 10000) {
				point = 790;
			}else if (price <= 10000) {
				point = 0;
			}
			
			//�׸��Է�
			if (i == 1) {
				name1 = name;
				price1 = price;
				point1 = point;
			}else if (i == 2) {
				name2 = name;
				price2 = price;
				point2 = point;
			}else if (i == 3) {
				name3 = name;
				price3 = price;
				point3 = point;
			}else if (i == 4) {
				name4 = name;
				price4 = price;
				point4 = point;
			}else if (i == 5) {
				name5 = name;
				price5 = price;
				point5 = point;
			}
		
			//���
		
		
		
			
		}
		String prinvalue = "";
		System.out.println(prinvalue = "��ǰ�� " + "\t" + " ��ǰ����" + "\t" + "����Ʈ");
		System.out.println(prinvalue = "=====================");
		System.out.println(prinvalue = name1 + "\t" + price1 + "\t" + point1 + "\n" + name2 + "\t" + price2 + "\t" +point2 + "\n" + name3 + "\t" + price3 + "\t" +point3+ "\n" 
				+ name4 + "\t" + price4 + "\t" +point4+ "\n" + name5 + "\t" + price5 + "\t" +point5+ "\n");
//		prinvalue += 

	}


}
