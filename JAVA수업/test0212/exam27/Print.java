package exam27;

import java.util.ArrayList;
import java.util.Scanner;

public class Print extends sangpum {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<sangpum> array = new ArrayList<sangpum>();
		
		while(true) {
			System.out.println("1 : ������ , 2 : ���ǰ��� , ��Ÿ : ���� :");
			String scan = input.next();
			
			if(scan.equals("1")) {
				System.out.println("��ǰ��" + "\t" + "����");
				for(int i = 0; i<array.size(); i++) {
					array.get(i).disp();
					}
				System.out.println("-----------------");
				System.out.println("�հ� :\t" +total);
			}else if(scan.equals("2")) {
				sangpum sp = new sangpum();
				sp .input();
				array.add(sp);
				
			}else {
				break;
			}
		}
		
		System.out.println("-- �ȳ��� ������ --");
			
		
		
		
	}

}
