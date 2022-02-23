package br.com.dio.exercicios.arrays;

public class Ex1_OrdemInversa {

	public static void main(String[] args) {
		int[]vetor = {12,6,9,-7,3,2};
		int aux = vetor.length-1;
		
		for(int i =aux; i>=0; i--) {
			System.out.println(vetor[i]);
		}
}
}