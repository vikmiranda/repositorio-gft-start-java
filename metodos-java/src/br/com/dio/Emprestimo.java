package br.com.dio;
//calcular valor final de um emprestimo com base nas taxas de parcelamento
//neste caso usei a regra: 4.2% de acrescimo a cada parcela.
public class Emprestimo {
	public static double getTaxaParcelas(int parcelas) {
		return parcelas * 0.042;
	}

	public static void calcular(double valor, int parcelas) {
			double valorFinal = valor + (valor * getTaxaParcelas(parcelas));
				System.out.println("Valor final do emprestimo de "+valor+ " em " +parcelas+ " parcelas: R$"+valorFinal);
		}
		
	}

