package test04;

import java.util.Scanner;

public class Student {
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;
	
	Scanner input = new Scanner(System.in);
	


public void input() {
	System.out.println("�̸� : ");
	name = input.next();
	System.out.println("���� : ");
	kor = input.nextInt();
	System.out.println("���� : ");
	eng = input.nextInt();
	System.out.println("���� : ");
	mat = input.nextInt();
	
	sum(kor,eng,mat);
	aver(kor,eng,mat);
}

public void sum(int kor, int eng, int mat) {
	tot = kor + eng + mat;
}

public void aver(int kor, int eng, int mat) {
	avg = (kor + eng + mat) / 3;
}

public void disp() {
	System.out.print(name + " \t ");
	System.out.print(kor + " \t ");
	System.out.print(eng + " \t ");
	System.out.print(mat + " \t ");
	System.out.print(tot + " \t ");
	System.out.println(avg + " \t ");
	
}
}