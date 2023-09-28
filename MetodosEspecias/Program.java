package MetodosEspecias;

import MetodosEspecias.Banco;

public class Program {

	public static void main(String[] args) {
		/*
		Caneta c1 = new Caneta("NIC", "AMARELA", 0.8f);
		c1.status();
		
		Caneta c2 = new Caneta("Kkk", "Laranha", 1.0f);
		c2.status();
		*/
		
		/*
		Carro car1 = new Carro();
		car1.setChassi("123458-0258f");
		car1.setPlaca("AFJK-12JU");
		car1.setCor("Preto");
		car1.setLigado(true);
		
		car1.imprimir();
		
		Carro car2 = new Carro("12345587-897", "AFG3-UJH76", "Branco");
		car2.imprimir();*/
		
		//Aula #05a e #05b Exemplo prático
		Banco p1 = new Banco();
		p1.setNumConta(1325);
		p1.setNome("Jubileu");
		p1.setTipo("CP");
		
		p1.abriConta("CP");
		p1.depositar(100);
		p1.exibir();
		
		Banco p2 = new Banco();
		p2.setNumConta(2222);
		p2.setNome("Creuza");
		
		p2.abriConta("CP");
		p2.depositar(650);
		p2.sacar(100);
		p2.fecharConta();
		p2.exibir();
		
		
	}

}


}
