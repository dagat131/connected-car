package day06;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		String nu = "";
		int price = 0;
		
		while (true) {
			System.out.println("���� �Է� : ");
			String name = input.nextLine();
			nu = nu + name;
			
			if (name.contentEquals("q")) {
				System.out.println("���Թ��� : " + nu);
				break;
			}
			
		}
	}

}
