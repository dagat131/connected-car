package day04;

public class Ex09 {

	public static void main(String[] args) {
		System.out.println(Math.max(5, 7));
		System.out.println(Math.min(5, 7));
		System.out.println(Math.sqrt(64));   //제곱근
		System.out.println(Math.abs(-4.7));  // 절대값
		System.out.println(Math.random()); // 0과 1 사이의 난수 발생, 0은 포함, 1은 미포함
		
		int n = (int) (Math.random()*100) + 1;
		System.out.println(n);
	}

}
