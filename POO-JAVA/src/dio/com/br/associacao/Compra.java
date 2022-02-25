package dio.com.br.associacao;

public class Compra {
	String produto;
	double valorProduto;
	
	double finalizar(double valorProduto, Cupom cupom) {
		return valorProduto-cupom.valorCupom;
	}
}
