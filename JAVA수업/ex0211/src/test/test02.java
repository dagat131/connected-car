package test;

import java.util.Scanner;

class test02{
	Scanner input = new Scanner(System.in);
	String name = "";
	int kor;
	int eng;
	int mat;
	int sci;
	int all;
	double avg;



public void input(){
	System.out.println("�̸� : ");
	name = input.next();
	System.out.println("���� : ");
	kor = input.nextInt();
	System.out.println("���� : ");
	eng = input.nextInt();
	System.out.println("���� : ");
	mat = input.nextInt();
	System.out.println("���� : ");
	sci = input.nextInt();
	
	sum(kor,eng,mat,sci);
	aver(kor,eng,mat,sci);
}

public void sum(int kor, int eng, int mat, int sci) {
	all = kor + eng + mat + sci;
}

public void aver(int kor, int eng, int mat, int sci) {
	avg = ( kor + eng + mat + sci) / 3;
}

public void disp() {
	System.out.println(name + "\t");
	System.out.println(kor + "\t");
	System.out.println(eng + "\t");
	System.out.println(mat + "\t");
	System.out.println(sci + "\t");
	System.out.println(all + "\t");
	System.out.println(avg + "\t");
	}
}