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
		System.out.println("이름 : ");
		name = input.next();
		System.out.println("전화번호 : ");
		tel = input.next();
		System.out.println("주소 : ");
		adress = input.next();
		
	}
	
	public void disp() {
		System.out.print(name + "\t");
		System.out.print(tel + "\t");
		System.out.println(adress + "\t");
	}
	
}
