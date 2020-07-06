package exam04;

public class SJExample {

	public static void main(String[] args) {
		SJ s1 = new SJ(); //按眉积己
		s1.name = "全辨悼";
		s1.kor = 90;
		s1.eng = 80;
		s1.mat = 70;
		s1.tot = s1.kor + s1.eng + s1.mat;
		s1.avg = (double)s1.tot / 3;
		
		SJ s2 = new SJ();
		s2.name = "辫枚荐";
		s2.kor = 50;
		s2.eng = 60;
		s2.mat = 50;
		s2.tot = s2.kor + s2.eng + s2.mat;
		s2.avg = (double)s2.tot / 3;
		String all = s2.name+ "," + s2.kor+ "," + s2.eng+ "," + s2.mat+ "," + s2.tot+ "," + s2.avg ;
		
		System.out.println(all);
		

	}

}
