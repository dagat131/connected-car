package exam27;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Product {
		Scanner input = new Scanner(System.in);
		LocalDateTime myDateObj = LocalDateTime.now();
		
		String name;
		int price;
		static int total;
		
		public void input(){
			System.out.println("상품을 입력하세요 : ");
			name = input.next();
			System.out.println("가격을 입력하세요 : ");
			price = input.nextInt();
			
			
			total += price;
		}
		
		public void disp() {
			System.out.print(name + "\t");
			System.out.print(price + "\t");
			DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			String formattedDate = myDateObj.format(myFormatObj);
			System.out.println(formattedDate);
		}
		
}
