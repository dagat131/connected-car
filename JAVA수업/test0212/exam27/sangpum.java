package exam27;

import java.util.Scanner;

public class sangpum {
	String name;
	 int price;
	 static int total;
	
	Scanner input = new Scanner(System.in);
	
	public sangpum() {
		this.name = name;
		this.price = price;
	}
	
	public void input() {
		System.out.println("��ǰ�� �Է��ϼ��� : ");
		name = input.next();
		System.out.println("������ �Է��ϼ��� : ");
		price = input.nextInt();
		
		total += price;
	}
		
	public void disp() {
		System.out.print(name + "\t");
		System.out.println(price + "\t");
//		System.out.println(total + "\t");
		
	}

	
//	 public static void total() {
//		total += price;
//		System.out.println(total + "\t");
//	}
//	
	
	
	
}
