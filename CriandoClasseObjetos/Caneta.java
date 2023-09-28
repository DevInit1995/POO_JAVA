package CriandoClasseObjetos;

public class Caneta {
	// Aula #02b Criando Classe e Objetos

	public String modelo;
	public String cor;
	private double ponta;
	protected int carga;
	private boolean tampada;

	public void status() {
		System.out.println("Uma caneta " + this.cor);
		System.out.println("está tampada? " + this.tampada);
		System.out.println("Modelo da caneta? " + this.modelo);
		System.out.println("A carga da caneta é? " + this.carga);
		System.out.println("A ponta da caneta é? " + this.ponta);
	}

	public void rabiscar() {

		if (tampada == true) {
			System.out.println("ERRO!");
		} else {
			System.out.println("Rabisco.");
		}
	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = true;
	}

}
