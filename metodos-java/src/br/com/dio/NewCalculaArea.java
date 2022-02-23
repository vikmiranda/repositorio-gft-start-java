package br.com.dio;
//recriando o exercicio calculaArea para trabalhar o return. nesse caso deve os metodos devem retornar um tipo, e não void.
public class NewCalculaArea {
	
	//quadrado
	public static double calcular(double lado) {
		 return Math.pow(lado, 2);
	}
	
	//retangulo
	public static double calcular(double base, double altura) {
		return base * altura;
	}
	
	//	trapezio
	public static double calcular(double baseMaior, double baseMenor, double altura) {
		return ((baseMaior+baseMenor) * altura) /2;
	}
	

}
