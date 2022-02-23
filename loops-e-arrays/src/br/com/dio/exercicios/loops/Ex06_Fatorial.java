package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex06_Fatorial {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		System.out.print("fatorial de: ");
		num = ler.nextInt();
		int fat =1;
		
		
		for(int i= num; i>=1; i--) {
			fat *= i;
		}
		System.out.println("fatorial: "+fat);
		
		
		
		
//		for(int i= 2; i<=num; i++) {
//			fat *= i;
//		}
//		System.out.println("Fatorial: "+fat);
	}

}
