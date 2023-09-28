package Exercicio;

import java.util.Scanner;

import Exercicios.DominioExcecoes;

/*
Fazer um programa para ler os dados de uma conta bancária e depois realizar um
saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer
ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de
saque da conta. */
public class Account extends DominioExcecoes {

	private Integer numero;
	private String proprietario;
	private double saldo;
	private double limiteRetirada;

	public Account() {
		this.saldo = 500.0;
		this.limiteRetirada = 300.0;
	}

	public void imprimir() {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe o número da conta: " + getNumero());
		// this.numero = leitor.nextInt();

		System.out.println("Informe o Proprietario: " + getProprietario());
		// this.proprietario = leitor.nextLine();

		System.out.println("Saldo: " + getSaldo());
		// this.saldo = leitor.nextDouble();

		System.out.println("Limite da retirada: " + getLimiteRetirada());
		// this.limiteRetirada = leitor.nextDouble();
	}

	public void depositar(double quantia) {
		saldo = saldo + quantia;
	}

	public void sacar(double quantia) {
		saldo = saldo - quantia;

		if (this.getLimiteRetirada() == 300) {

		}
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimiteRetirada() {
		return limiteRetirada;
	}

	public void setLimiteRetirada(double limiteRetirada) {
		this.limiteRetirada = limiteRetirada;
	}
}
