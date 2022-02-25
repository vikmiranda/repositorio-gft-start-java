package dio.com.br;

public class Carro {
	
	String cor, placa, modelo;
	int ano, capacidadeTanque;
	
	Carro(){
	}
	Carro(String cor, String placa, String modelo, int ano, int capacidadeTanque){
		this.cor = cor;
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.capacidadeTanque = capacidadeTanque;
	}
	
	
	void setCor(String cor) {
		this.cor = cor;
	}
	
	String getCor() {
		return cor;
	}
	
	void setModelo(String modelo) {
		this.modelo= modelo;
	}
	String getModelo() {
		return modelo;
	}
	
	void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque= capacidadeTanque;
	}
	int getCapacidadeTanque() {
		return capacidadeTanque;
	}
	
	double totalValor(double valorCombustivel) {
		return capacidadeTanque * valorCombustivel;
	}
	
}
