package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class Ex02_Consoantes {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String[] consoantes = new String[6];
		int qntConsoante= 0; int count = 0;
		
		do {
			System.out.println("informe uma letra: ");
			String letra = ler.next();
			
			if (!(letra.equalsIgnoreCase("a")|
					letra.equalsIgnoreCase("e")|
					letra.equalsIgnoreCase("i")|
					letra.equalsIgnoreCase("o")|
					letra.equalsIgnoreCase("u"))
 ){		
	consoantes[count]=letra;		
			}
			qntConsoante++;
			count++;
			
	}while(count < consoantes.length);
		System.out.println("quantidade de consoantes: "+qntConsoante);
		
		for (String item : consoantes) {
			if(item != null) {
			System.out.print(item + " ");}
			
		}
}
}
