package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex02_Nota {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota;
		
		while(true) {
			System.out.println("informe sua nota: ");
			nota = ler.nextDouble();
			if (nota >10 || nota < 0) { 
				System.out.println("nota inválida.");}
			else {
				break;}
				
		}
	}

}
