package day06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner grade = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���.");
		String name = grade.nextLine();
		System.out.println("���� : ");
		int gug = grade.nextInt();
		
		System.out.println("���� : ");
		int eng = grade.nextInt();
		
		System.out.println("���� : ");
		int math = grade.nextInt();
		
		//-----------------------------
		
		//ó�� -------------------------
		int all = gug + math + eng;
		System.out.println("���� : " + all);
		
		double all2 = all / 3.0;
		System.out.println("��� : " + Math.round(all2));
		// ----------------------------
		
		
		String all3 = "";
		switch((int)all2 / 10) {
			case 10:
				all3 = "A";
				break;
			case 9: 			
				all3 = "A";
				break;
			case 8:
				all3 = "B";
				break;
			case 7:
				all3 = "C";
				break;
			case 6:
				all3 = "D";
				break;
			default:
				all3 = "F";
				break;
		}
				
		String prinValue = "";
		prinValue += "============================================================\n";
		prinValue += "�̸�" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t" + "���" + "\t" + "���\n";
		prinValue += "============================================================\n";
		prinValue += name + "\t" + gug + "\t" + eng + "\t" + math + "\t" + all + "\t" + Math.round(all2) + "\t" + all3+ "\n";
		prinValue += "============================================================\n";
		
		System.out.println(prinValue);
		}
	}


