package Exercicio;

import Exercicio.Account;

public class Program {

	public static void main(String[] args) {

		Account conta = new Account();
		// conta.depositar(300);
		conta.sacar(0);
		conta.setNumero(2588);
		conta.setProprietario("Jhon");
		conta.imprimir();

	}

}
