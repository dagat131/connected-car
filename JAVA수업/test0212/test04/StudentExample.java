package test04;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("1 : ��ȸ , 2 : ��� , ��Ÿ : ���� :");
			
			String scan = input.next();
			if(scan.contentEquals("1")) {
				System.out.println("�̸�" + "\t" + "����" + "\t" + "����"+ "\t" + "����" + "\t" + "����" + "\t" + "���");
				for (int i = 0; i < arrayList.size(); i++) {
					arrayList.get(i).disp();
				}
			}else if(scan.contentEquals("2")) {
				Student student = new Student();
				student.input();
				arrayList.add(student);
			}else {
				break;
			}
			
			
		}System.out.println("---���α׷� ����---");
		

	}

}
