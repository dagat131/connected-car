package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�̸�, �ֹι�ȣ�� �Է��ϼ���.");
		
		String name = in.readLine();
		String num = in. readLine();
		
		System.out.println(name + "�Դϴ�.");
		
		String nums = num.substring(6,7);
		nums = (nums.contentEquals("1") || nums.contentEquals("3")     ) ? "����" : "����";
		System.out.println(nums + "�Դϴ�");
		
		String numw = num.substring(0,2);
		int numww = Integer.parseInt(numw);
		numww = 2020 - (1900+numww);
		System.out.println(numww);
			
		String locals = num.substring(7,8);
		int localss = Integer.parseInt(locals);
		
		String local3 = (localss==1) ? "����" :  (localss==2) ? "��⵵" : (localss==3) ? "������" : (localss==4) ? 
				"��û�ϵ�" : (localss==5) ? "��û����" : (localss==6) ? "�뱸������" : (localss==7) ? 
				"���ϵ�" : (localss==8) ? "��󳲵�" : "�λ걤����" ;
		System.out.println(local3);
		
		
		String prnvalue = "";
		System.out.println(prnvalue);
		
//		System.out.println("����� �̸��� " + name + " �Դϴ�.");
//		System.out.println("����� ������ "+ nums + " �Դϴ�.");
//		System.out.println("����� ���̴� " + numww + " �Դϴ�.");
//		System.out.println("����� ������ " + local3 + " �Դϴ�.");
//		


	}

}
