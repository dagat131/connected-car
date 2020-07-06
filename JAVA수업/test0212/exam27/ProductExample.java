package exam27;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductExample extends Product {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Product> arrayList = new ArrayList<Product>();
	
		while(true) {
			System.out.println("1. 영수증, 2. 물건결제, 3. 종료");
			String inputs = input.next();
			
			if(inputs.contentEquals("1")) {
				for(int i = 0; i<arrayList.size(); i++) {
					arrayList.get(i).disp();
					
				}
				System.out.println("===========================");
				System.out.println("합계 : \t" + total);
				
			}else if(inputs.contentEquals("2")) {
				Product product = new Product();
				product.input();
				arrayList.add(product);
			}else {
				break;
			}
			
		}
	}

}
