package dio.com.br.Interface;

public class Calculadora implements OperacaoMatematica{
	
	@Override
	public void soma(double num1, double num2) {
		System.out.println(num1+num2);
	}
	@Override
	public void subtracao(double num1, double num2) {
		System.out.println(num1-num2);
	}
	@Override
	public void multiplicacao(double num1, double num2) {
		System.out.println(num1*num2);
	}
	
	@Override
	public void divisao(double num1, double num2) {
		System.out.println(num1/num2);
	}
	

}
