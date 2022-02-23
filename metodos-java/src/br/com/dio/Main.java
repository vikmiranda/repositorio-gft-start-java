package br.com.dio;

public class Main {

	public static void main(String[] args) {		
		//Calculadora
		Calculadora.soma(2, 3);
		Calculadora.subtracao(5.3,2.1);
		Calculadora.multiplicacao(2, 8);
		Calculadora.divisao(29, 3);
		
		//Mensagem
		Mensagem.obterMensagem(8);
		Mensagem.obterMensagem(7);
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(20);
		Mensagem.obterMensagem(23);
		
		//Emprestimo
		Emprestimo.calcular(1500, 6);
		Emprestimo.calcular(4000, 20);
		Emprestimo.calcular(200, 4);
		Emprestimo.calcular(820, 10);
		
		
		//Sobrecarga calculo area
		CalculaArea.calcular(3);
		CalculaArea.calcular(7, 8, 9);
		CalculaArea.calcular(5, 5);
		
		//Calculo Area trabalhando os return
		System.out.println();
		double areaQuadrado = NewCalculaArea.calcular(4);
		System.out.println("A área do quadrado é: " + areaQuadrado);
		
		double areaRetangulo = NewCalculaArea.calcular(4, 7);
		System.out.println("A área do retângulo é: " + areaRetangulo);
		
		double areaTrapezio = NewCalculaArea.calcular(7,8,9);
		System.out.println("A área do trapézio é: " + areaTrapezio);
	}
	
}
	      
