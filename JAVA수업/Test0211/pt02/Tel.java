package pt02;

import java.util.Scanner;

public class Tel {
	Scanner input = new Scanner(System.in);
	
	//Member Field
	String name;
	String tel;
	String adress;
	
	//method
	public void input() {
		System.out.println("�̸� : ");
		name = input.next();
		System.out.println("��ȭ��ȣ : ");
		tel = input.next();
		System.out.println("�ּ� : ");
		adress = input.next();
		
	}
	
	public void disp() {
		System.out.print(name + "\t");
		System.out.print(tel + "\t");
		System.out.println(adress + "\t");
	}
	
}
