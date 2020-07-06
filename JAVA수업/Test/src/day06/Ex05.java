package day06;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("상품이름, 가격을 입력하세요 : ");
		String a = input.nextLine();
		
		String name1 = "";
		String name2 = "";
		String name3 = "";
		int price1 = 0;
		int price2 = 0;
		int price3 = 0;
		
		
		for (int i = 0; i < 3; i++) {
			System.out.println("상품이름 : ");
			String n = input.next();
			System.out.println("가격 : ");
			int p = input.nextInt();
			
			if(i == 0) {
				name1 = n;
				price1 = p;
			}
			else if(i == 1) {
				name2 = n;
				price2 = p;
			}
			else if(i == 2) {
				name3 = n;
				price3 = p;
			}
		}
		System.out.println(name1 + price1);
		System.out.println(name2 + price2);
		System.out.println(name3 + price3);

	}

}
