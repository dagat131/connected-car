package ex0211;

public class ex01 {

	public static void main(String[] args) {
		int[] s1 = {11,22,33,44,55};
		String[] s2 = {"��","��","��","��","��","��","��"};
		
		for(int i = 0; i <s1.length; i++) {
			System.out.println(i);
		}
		for(int i : s1) {
			System.out.println();
		}
		for(String s : s2) {
			System.out.println();
		}

	}

}
