package MetodosEspecias;

//Aula #05a e #05b Exemplo prático
public class Banco {

	public int numConta;
	protected String tipo;
	private String nome;
	private double saldo;
	private boolean status;

	public Banco() {
		this.numConta = numConta;
		this.tipo = tipo;
		this.nome = nome;
		this.saldo = 0;
		this.status = false;

	}

	public void exibir() {
		System.out.println("Informe o Número da conta: " + this.getNumConta());
		System.out.println("Informe o tipo da conta: " + this.getTipo());
		System.out.println("Informe o seu nome: " + this.getNome());
		System.out.println("Seu saldo? " + this.getSaldo());
		System.out.println("Status da conta: " + this.getStatus());
	}

	public void abriConta(String tipo) {
		setTipo(this.tipo);
		setStatus(true);
		if (this.tipo == "CC") {
			saldo += saldo + 50;
		} else if (this.tipo == "CP") {
			saldo += 150;
		}
	}

	public void fecharConta() {
		if (this.saldo > 0) {
			System.out.println("Conta com dinheiro, não pode ser fechada");
		} else if (this.saldo < 0) {
			System.out.println("Conta em débito, não pode ser fechada");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso.");
		}
	}

	public void depositar(double valor) {
		if (this.status == true) {
			// setSaldo(getSaldo() + valor);
			// ou
			this.saldo += valor;
			System.out.println("\nDeposito efetuado com sucesso na conta de " + getNome());
		} else {
			System.out.println("Impossível depositar em uma conta fechada");
		}
	}

	public void sacar(double valor) {
		if (this.getStatus()) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(this.saldo - valor);
				System.out.println("Saque realizado na conta de " + this.nome);
			} else {
				System.out.println("Saldo insuficiente para sacar");
			}
		} else {
			System.out.println("Impossivel sacar de uma conta fechada");
		}
	}

	public void pagarMensal() {
		double valor = 0;
		if (this.tipo == "CC") {
			valor = 12;
		} else if (this.tipo == "CP") {
			valor = 20;
		}
		if (this.status) {

			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Mesalidade paga com sucesso por " + this.getNome());

		} else {
			System.out.println("Imposivel pagar conta fechada");
		}
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = true;
	}
}
