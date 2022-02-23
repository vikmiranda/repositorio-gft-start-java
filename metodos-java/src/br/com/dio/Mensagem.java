package br.com.dio;
//mostrar mensagem de bom dia, tarde ou noite, de acordo com a hora.
public class Mensagem {
	
	public static void obterMensagem(int hora) {
		//de 5 até 11:59, imprimir 'Bom dia'
		if (hora >= 5 && hora <12) {
			mensagemBomdia();
		}
		//de 12 até 17:59, imprimir 'Boa tarde'
		else if(hora >= 12 && hora < 18) {
			mensagemBoaTarde();
		}
		else {
			mensagemBoaNoite();
		}
		
		
	}

	private static void mensagemBoaNoite() {
		System.out.println("Boa Noite!");		
	}

	private static void mensagemBoaTarde() {
		System.out.println("Boa Tarde!");		
		
	}

	private static void mensagemBomdia() {
		System.out.println("Bom Dia!");		

		
	}
	
	
}
