package day07;

public class Ex04 {

	public static void main(String[] args) {
		String a = "010-1111-2222";
		String[] b = a.split("-");
		System.out.println(b[2]);
		
		b[2] = "4916";
		System.out.println(b[2]);

	}

}
