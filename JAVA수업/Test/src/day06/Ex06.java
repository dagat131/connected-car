package day06;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		String mel = "¸á·Ð";
		String gr = "Æ÷µµ";
		String sa = "½Ó";
		String j = "Áö";
		String s = "½Ã";
		
		int melon = 15000;
		int gra = 20000;
		int sam = 9000;
		int ji = 50000;
		int si = 3000;
		
		int all = melon + gra + sam + ji + si;
		
		
		int points = 0;
		
		if (melon >= 50000) {
			points = 10000;
		}
		else if (melon >= 30000) {
			points = 2990;
		}else if (melon >= 20000) {
			points = 1890;
		}else if (melon >= 10000) {
			points = 590;
		}else if (melon <= 10000) {
				points = 590;
			}
			
		
		if (gra >= 50000) {
			points = 10000;
		}
		else if (gra >= 30000) {
			points = 2990;
		}else if (gra >= 20000) {
			points = 1890;
		}else if (gra >= 10000) {
			points = 590;
		}else if (gra <= 10000) {
			points = 590;
		}
		if (sam >= 50000) {
			points = 10000;
		}
		else if (sam >= 30000) {
			points = 2990;
		}else if (sam >= 20000) {
			points = 1890;
		}else if (sam >= 10000) {
			points = 590;
		}else if (sam <= 10000) {
			points = 590;
		}
		
		if (ji >= 50000) {
			points = 10000;
		}
		else if (ji >= 30000) {
			points = 2990;
		}else if (ji >= 20000) {
			points = 1890;
		}else if (ji >= 10000) {
			points = 590;
		}else if (ji <= 10000) {
			points = 590;
		}
		
		if (si >= 50000) {
			points = 10000;
		}
		else if (si >= 30000) {
			points = 2990;
		}else if (si >= 20000) {
			points = 1890;
		}else if (si >= 10000) {
			points = 590;
		}else if (si <= 10000) {
			points = 590;
		}
		
	
		
		String PrinValue = "";
		System.out.println(PrinValue = mel + "...." + melon + "(" + points + ")");
		System.out.println(PrinValue = gr + "...." + gra + "(" + points + ")");
		System.out.println(PrinValue = sa + "...." + sam + "(" + points + ")");
		System.out.println(PrinValue = j + "...." + ji + "(" + points + ")");
		System.out.println(PrinValue = s + "...." + si + "(" + points + ")");
		System.out.println("===========================================");
		System.out.println("ÇÕ°è" + "...." + all + "("  + ")");
	}

}
