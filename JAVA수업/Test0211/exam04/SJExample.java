package exam04;

public class SJExample {

	public static void main(String[] args) {
		SJ s1 = new SJ(); //객체생성
		s1.name = "홍길동";
		s1.kor = 90;
		s1.eng = 80;
		s1.mat = 70;
		s1.tot = s1.kor + s1.eng + s1.mat;
		s1.avg = (double)s1.tot / 3;
		
		SJ s2 = new SJ();
		s2.name = "김철수";
		s2.kor = 50;
		s2.eng = 60;
		s2.mat = 50;
		s2.tot = s2.kor + s2.eng + s2.mat;
		s2.avg = (double)s2.tot / 3;
		String all = s2.name+ "," + s2.kor+ "," + s2.eng+ "," + s2.mat+ "," + s2.tot+ "," + s2.avg ;
		System.out.println(all);
		//스플릿으로 콤마를 기준으로 배열을 나누고 for문으로 length 값으로 출력하기!
		String[] all2 = all.split(",");
		for(int i = 0; i < all2.length; i++) {
			System.out.println(all2[i]);
		}
		//스플릿으로 콤마를 기준으로 해서 i 값으로 출력
		System.out.println();
		for(int i = 0; i<all.split(",").length; i++) {
			System.out.println(all.split(",")[i]);
		}
		

	}

}
