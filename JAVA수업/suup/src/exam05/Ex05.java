package exam05;

public class Ex05 {
	//멤버변수  ->> 전역변수
	String name;
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;
	
	//생성자 - 기본생성자  --> 여러개가 올 수 있음.  매개변수가 달라야함.  자동으로 생성이됨.
//	public Ex05() {
//	}
	
	
//	"홍길동", 90, 80, 70
	public Ex05(String name, int kor, int eng, int mat) { //매개변수  ->> 지역변수  / 맞게 입력필요
		this.name = name;    // 앞의 네임은 전역변수 / 뒤의 네임은 지역변수
		this.kor = kor;		 // 앞의 국어는 전역변수 / 뒤의 네임은 지역변수
		this.eng = eng;		 // 앞의 영어는 전역변수 / 뒤의 네임은 지역변수
		this.mat = mat;		 // 앞의 수학은 전역변수 / 뒤의 네임은 지역변수
		tot = kor + eng + mat;
		avg = (double) tot / 3;
	}
}
