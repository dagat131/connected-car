package day04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex08 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("이름 : ");
		String name = in.readLine();
		System.out.println("이름 : ");
		String name2 = in.readLine();
		
		System.out.println("국어 : ");
		String gug = in.readLine();
		System.out.println("국어 : ");
		String gug2 = in.readLine();
		
		System.out.println("영어 : ");
		String eng = in.readLine();
		System.out.println("영어 : ");
		String eng2 = in.readLine();

		System.out.println("수학 : ");
		String math = in.readLine();
		System.out.println("수학 : ");
		String math2 = in.readLine();
		
		System.out.println("과학 : ");
		String sci = in.readLine();
		System.out.println("과학 : ");
		String sci2 = in.readLine();
		
		System.out.println("역사 : ");
		String his = in.readLine();
		System.out.println("역사 : ");
		String his2 = in.readLine();
		
		int all = Integer.parseInt(gug) + Integer.parseInt(eng) + Integer.parseInt(math) + Integer.parseInt(sci) + Integer.parseInt(his) ;
		int all2 = Integer.parseInt(gug2) + Integer.parseInt(eng2) + Integer.parseInt(math2) + Integer.parseInt(sci2) + Integer.parseInt(his2);
		
		int avg = all / 5;
		int avg2 = all2 / 5;
		
		String re = avg <= 80 ? "재시험":"";
		String re2 = avg2 <= 80 ? "재시험":"";
		
		String a = "============================================================";
		String b = "이름\t" + "국어\t" + "영어\t" + "수학\t" + "과학\t" + "역사\t" + "총점\t" + "평균\t" + "재시험\t";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a); 
		System.out.println(name + "\t" + gug + "\t" + eng + "\t" + math + "\t" + sci + "\t" + his + "\t" + all + "\t" + avg + "\t" + re);
		System.out.println(name2 + "\t" + gug2 + "\t" + eng2 + "\t" + math2 + "\t" + sci2 + "\t" + his2+ "\t" + all2 + "\t" + avg2 + "\t" + re2);
		System.out.println();
		System.out.println(a);
	}

}
