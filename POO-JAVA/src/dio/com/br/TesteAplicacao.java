package dio.com.br;

import java.util.Scanner;

public class TesteAplicacao {

	public static void main(String[] args) {

		Carro carro1 = new Carro();
		carro1.setCor("Preto");
		carro1.setModelo("Mustang");
		carro1.setCapacidadeTanque(40);
		
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getCapacidadeTanque());
		System.out.println("O valor para encher o tanque é: "+carro1.totalValor(6.10));

		
		Carro carro2 = new Carro("Azul", "XSD-0169", "Eclipse", 2021, 32 );
		
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCor());
		System.out.println(carro2.getCapacidadeTanque());
		System.out.println("O valor para encher o tanque é: "+ carro2.totalValor(6.10));
		
		
		
	}

		
}
