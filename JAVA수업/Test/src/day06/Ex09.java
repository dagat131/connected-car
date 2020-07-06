package day06;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		String nu = "";
		int price = 0;
		
		while (true) {
			System.out.println("물건 입력 : ");
			String name = input.nextLine();
			nu = nu + name;
			
			if (name.contentEquals("q")) {
				System.out.println("구입물건 : " + nu);
				break;
			}
			
		}
	}

}
