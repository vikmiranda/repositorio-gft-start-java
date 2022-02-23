package br.com.dio.exercicios.loops;
import java.util.Scanner;

public class Ex01_NomeIdade {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		String nome;
		
		
		while (true) {
			System.out.println("Informe seu nome: ");
			nome = ler.next();
			if (nome.equals("0")) {break;}
			System.out.println("Informe sua idade: ");
			idade = ler.nextInt();
		}
		System.out.println("programa encerrado");
	}

	
}

