package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex04_ParImpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int quantNum, num;
		int count = 0; int par= 0; int impar = 0;
		System.out.println("Quantidade de números ");
		quantNum = ler.nextInt();
		
		do {
			System.out.println("informe um número: ");
			num = ler.nextInt();
			if (num%2 == 0) {
				par++;
			}else {impar++;}
			
			count++;		
					
		}while(count < quantNum);
		
		System.out.println("Qnt números pares: " + par);
		System.out.println("Qnt números impares: " + impar);

	}
}
