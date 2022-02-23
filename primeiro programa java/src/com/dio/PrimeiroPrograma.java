package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		/*
		int a = 2;
		int b = 3;
		int result = a+b;
		System.out.println("soma: "+ result); */
		Gato gatinho = new Gato("Duque", "preto", 3);
		Livros livro = new Livros();
		System.out.println(gatinho);
		System.out.println(livro);
	}

}

class Livros{
	private String nome;
	private String npag;

}