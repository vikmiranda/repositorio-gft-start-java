package br.com.dio;
//calcular area dos 3 quadrilateros: quadrado, retangulo e trapézio. Usar sobrecarga

public class CalculaArea {
	//quadrado
	public static void calcular(double lado) {
		
		double resultado = Math.pow(lado, 2);
		System.out.println("A área do quadrado é: " + resultado);
	}
	
	//retangulo
	public static void calcular(double base, double altura) {
		double resultado = base * altura;
		System.out.println("A área do retângulo é: " + resultado);
	}
	
	//	trapezio
	public static void calcular(double baseMaior, double baseMenor, double altura) {
		double resultado = ((baseMaior+baseMenor) * altura) /2;
		System.out.println("A área do trapézio é: " + resultado);
	}
}
