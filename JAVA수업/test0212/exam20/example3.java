package exam20;

import java.util.ArrayList;
import java.util.Collections;

public class example3 {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(40);
		num.add(30);
		num.add(20);
		num.add(10);
		System.out.println(num);
		System.out.println(num.get(2));
		
		Collections.sort(num);
		System.out.println(num);
		for(int i : num) {
			System.out.println(i);
		}
		
		num.clear();
		System.out.println(num);
		

	}

}
