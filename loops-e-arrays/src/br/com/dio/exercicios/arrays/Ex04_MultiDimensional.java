package br.com.dio.exercicios.arrays;

import java.util.Random;

public class Ex04_MultiDimensional {

	public static void main(String[] args) {
		Random alt = new Random();
		int[][] M = new int[4][4];
		
		for(int i=0; i<M.length; i++) {
			for(int j = 0; j<M[i].length; j++) {
				M[i][j] = alt.nextInt(9);		
			}
		}
		
		int min = 10;
		for (int[] linha: M) {
			for (int elementoDaColuna: linha) {
				System.out.print(elementoDaColuna + " ");
				
				if(elementoDaColuna < min) {
					min = elementoDaColuna;
					
				}
			}
			
			System.out.println();
			
		}
		System.out.println("Menor elemento da matriz: "+ min);
}
}
