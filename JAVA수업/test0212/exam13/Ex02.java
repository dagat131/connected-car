package exam13;


public class Ex02 {

	public static void main(String[] args) {
		int[] s1 = {11, 22, 33, 44, 55};
		String[] s2 = {"빨","주","노","초","파","남","보"};
		
		for(int i = 0; i<s1.length; i++) {
			System.out.println(i);
		}
		for(int i : s1) {
			System.out.println(i);
		}
		for(String s : s2) {
			System.out.println(s);
		}
	}

}
