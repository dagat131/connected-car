package te;

import java.util.ArrayList;
import java.util.Scanner;

public class TelExample {

	public static void main(String[] args) {

		ArrayList<Tel> arrayList = new ArrayList<Tel>();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("1 : ��ȭ��ȣ ��ȸ , 2 : ��ȭ��ȣ ��� , �׿� : ���� :");
			
			String input = scan.next();
			if (input.contentEquals("1")) {
				
				for (int i = 0; i < arrayList.size(); i++) {
					arrayList.get(i).disp();
				}
			}
			else if(input.contentEquals("2")){
				Tel tele = new Tel();
				tele.input();
				arrayList.add(tele);
			}else {
				break;
		}
		}System.out.println("===The end===");
	}

}
