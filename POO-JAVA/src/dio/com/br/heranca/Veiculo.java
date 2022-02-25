package dio.com.br.heranca;

public class Veiculo {
	String placa,cor, modelo;
	int capacidadeTanque, ano;
	
	
	
	
	
	
	double totalValor(double valorCombustivel) {
		return capacidadeTanque * valorCombustivel;
	}
	
	
}
