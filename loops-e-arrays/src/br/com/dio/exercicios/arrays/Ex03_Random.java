package br.com.dio.exercicios.arrays;

import java.util.Random;

public class Ex03_Random {

	public static void main(String[] args) {
		Random alt = new Random();
		
		int[] numerosAleatorios = new int[20];
		
		for(int i=0; i<numerosAleatorios.length; i++) {
			int num = alt.nextInt(100);
			numerosAleatorios[i] = num;
		}
		for (int i : numerosAleatorios) {
			System.out.println(i + " sucessor: "+ (i+1));		
		}
	}

}
