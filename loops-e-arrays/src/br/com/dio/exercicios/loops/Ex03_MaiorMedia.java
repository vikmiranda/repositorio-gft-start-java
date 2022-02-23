package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex03_MaiorMedia {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		int count = 0;
		int maior = 0;
		int media = 0;
		do {
			System.out.println("informe um numero");
			num = ler.nextInt();
			if(num > maior) {
				maior = num;
			}
			media += num;
			count++;
			
		
		}while(count < 5);
		System.out.println("maior numero: "+maior);
		System.out.println("média dos números: " + (media/5));
		
		
		//int media = (nota1, nota2, nota3, nota4, nota5)/5;
		
		
				
		
	}

}
