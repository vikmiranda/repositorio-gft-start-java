package dio.com.br.heranca.updowncast;

public class Teste {

	public static void main(String[] args) {
		//Upcasts
		Funcionario faxineiro1 = new Faxineiro();
		Funcionario vendedor1 = new Vendedor();
		Funcionario gerente1 = new Gerente();
		
		//Downcast (é um conceito válido mas deve ser evitado)
		Vendedor vendedor2 = (Vendedor) new Funcionario();
		
				
	}

}
