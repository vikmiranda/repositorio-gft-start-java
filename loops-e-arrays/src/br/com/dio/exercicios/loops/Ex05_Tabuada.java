package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex05_Tabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		System.out.println("informe a tabuada desejada: ");
		num = ler.nextInt();
		System.out.println("Tabuada de "+ num);
		
		for(int i=0; i<11; ++i) {
			System.out.println(num +"X"+i +"= "+ (num*i));
		}

	}

}
