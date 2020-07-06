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
	System.out.println("이름 : ");
	name = input.next();
	System.out.println("국어 : ");
	kor = input.nextInt();
	System.out.println("영어 : ");
	eng = input.nextInt();
	System.out.println("수학 : ");
	mat = input.nextInt();
	System.out.println("과학 : ");
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