package day03;

public class Ex04 {

	public static void main(String[] args) {
//		대입연산자
//		int a = 5;
//		a = a + 1;
//		a += 1; // a = a + 1
//		a -= 1; // a = a - 1
//		a *= 2; // a = a * 2
//		증감연산자
//		int a = 5;
		/*
		int x = 5;
		int y = 0;
		y = ++x;
		
		System.out.println(y); //6
		System.out.println(x); //6
		
		int x = 5;
		int y = 0;
		y = x++;
		
		System.out.println(y); //5
		System.out.println(x); //6
		*/
		/*
		int x = 5;
		int y = 0;
		y = x--;
		
		System.out.println(y); 
		System.out.println(x); 
		
		int x = 5;
		int y = 0;
		y = --x;
		*/
//		int a = 5;
//		int b = 3;
	
		/* 논리연산자
		 * && : and
		 * || : or
		 * !  : not
		 */
		
//		System.out.println(a > b); 
//		System.out.println(a != b);
//		System.out.println(a >= b);
//		System.out.println(a <= b);
//		System.out.println(a == b);

		boolean r = (5 > 10) && (10<3);
		boolean b = (5 > 10) || (10<3);
		boolean c = !(5 > 10) && (10<3);
		boolean d = !(5 > 10) && !(10<3);
		boolean e = (5 > 10) || !(10<3);
		System.out.println(r);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}

}
